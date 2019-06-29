package com.hjbz.test.login;

import com.hjbz.nxxm.StuxmApp;
import com.hjbz.nxxm.module.users.dao.LoginMapper;
import com.hjbz.nxxm.module.users.entity.UserInfo;
import com.hjbz.nxxm.module.users.service.LoginService;
import com.hjbz.nxxm.module.users.shiro.MyShiroRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StuxmApp.class)
public class TestLoginAll {

	@Autowired
	private LoginMapper loginMapper;

	@Resource(name = "loginService")
	private LoginService loginService;

	@Resource
	private MyShiroRealm myShiroRealm;

	@Test
	public void testFindUserByPhone(){
		UserInfo userInfo = loginMapper.findUserByPhone("13895207756");
		System.out.println(userInfo);
	}





}
