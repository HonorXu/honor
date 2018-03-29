package com.honor.config;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.honor.dal.mapper.UserMapper;
import com.honor.model.User;
import com.honor.model.UserRole;

public class MyShiroRealm extends AuthorizingRealm {

	@Autowired
	private UserMapper userMapper;

	protected static final Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken u = (UsernamePasswordToken) token;
		// TODO 查询用户user信息
		User user = userMapper.selectByName(u.getUsername());
		if (user != null) {
			return new SimpleAuthenticationInfo(user, u.getPassword(), u.getUsername());
		} else {
			// TODO 不存在用户
			return null;
		}
	}

	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User user = (User) principals.getPrimaryPrincipal();
		logger.info("用户授权:" + JSON.toJSONString(user));

		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		List<UserRole> roleList = new ArrayList<>();
		for (UserRole userRole : roleList) {
			
		}

		//info.setStringPermissions(permissions);
		return null;
	}

}
