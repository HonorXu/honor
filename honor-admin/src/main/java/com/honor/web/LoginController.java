package com.honor.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.honor.model.User;


@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping(value = "/login")
	public String login(String username, String password, Model model, HttpServletRequest request) {
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(false);

		try {
			subject.login(token);
			if (subject.isAuthenticated()) {
				// 修改最后登录时间
				Session session = subject.getSession();
				session.setAttribute("fsServerPath", "11");
				return "redirect:/account/info";
			}
		} catch (UnknownAccountException e) {
			model.addAttribute("error", "账号密码错误");
		} catch (UserIsLockingException e) {
			model.addAttribute("error", "用户被锁定");
		} catch (EmailNotAuthException e) {
			model.addAttribute("error", "邮箱未认证");
		} catch (AuthenticationException e) {
			model.addAttribute("error", "账号密码错误");
		}
		token.clear();
		return "login";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		User user = (User) subject.getPrincipal();
		session.setAttribute("user", user);
		return "index";
	}

	@RequestMapping(value = "/notlogin", method = RequestMethod.GET)
	public String notlogin() {
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		// session 会销毁，在SessionListener监听session销毁，清理权限缓存
		if (subject.isAuthenticated())
			subject.logout();
		return "login";
	}

	@RequestMapping(value = "/unauthorized", method = RequestMethod.GET)
	@ResponseBody
	public String unauthorized() {
		return "无权限";
	}

}
