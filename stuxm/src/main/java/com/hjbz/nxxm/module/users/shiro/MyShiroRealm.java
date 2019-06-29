package com.hjbz.nxxm.module.users.shiro;

import com.hjbz.nxxm.module.users.entity.UserInfo;
import com.hjbz.nxxm.module.users.service.LoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class MyShiroRealm extends AuthorizingRealm {

	@Resource(name = "loginService")
	private LoginService loginService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {


		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
		String username = (String) authenticationToken.getPrincipal();
		System.out.println("username===============>>>>"+username);
		UserInfo userInfo = loginService.findUserByPhone(username);
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username,userInfo.getPwd().toString(),getName());
		return simpleAuthenticationInfo;
	}
}
