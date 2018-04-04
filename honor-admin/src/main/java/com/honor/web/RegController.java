package com.honor.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegController {

    /**
     * 跳转到注册页
     * @return
     */
    @RequestMapping(value = "/reg",method = RequestMethod.GET)
    public String login() {
    	SecureRandomNumberGenerator secureRandomNumberGenerator=new SecureRandomNumberGenerator();
        String salt= secureRandomNumberGenerator.nextBytes().toHex();
        Object password = null;
		SimpleHash hash = new SimpleHash("md5", password, salt, 2);
        System.out.println(salt);
        System.out.println("password:"+hash.toHex());
        return "reg";
    }


    /**
     * 跳转到注册第二步：邮件发送页
     * @param email
     * @param merchantId
     * @param model
     * @return
     */
    @RequestMapping(value = "/regVerify",method = RequestMethod.GET)
    public String regVerify(String email,Integer merchantId,Model model,HttpServletRequest request) {
    	
        model.addAttribute("email", email);
        model.addAttribute("merchantId", merchantId);
        return "reg_verify";
    }

    /**
     * 重新发送认证邮件
     * @param email
     * @param merchantId
     * @param model
     * @return
     * @throws MessagingException
     */
    @RequestMapping(value = "/reSendAuthEmail",method = RequestMethod.GET)
    public String reSendAuthEmail(String email,Integer merchantId,Model model,HttpServletRequest request)  {
        model.addAttribute("email", email);
        model.addAttribute("merchantId", merchantId);
        try {
        	
        } catch (Exception e) {
            e.printStackTrace();
            // TODO 暂不处理
        }
        return "reg_verify";
    }

    /**
     * 认证邮箱
     * @param merchantId
     * @return
     */
    @RequestMapping(value="/authEmail",method = RequestMethod.GET)
    public String authEmail(Integer merchantId,Model model,HttpServletRequest request){
        return "reg_success";
    }

}
