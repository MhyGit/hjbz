package com.hjbz.test.login;

import com.hjbz.stuxm.StuxmApp;
import com.hjbz.stuxm.module.users.dao.LoginMapper;
import com.hjbz.stuxm.module.users.entity.UserInfo;
import com.hjbz.stuxm.module.users.service.LoginService;
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


	@Test
	public void testFindUserByPhone(){
		UserInfo userInfo = loginMapper.findUserByPhone("13895207756");
		System.out.println(userInfo);
	}

	@Test
	public void testFindUserByUsername(){
		UserInfo userInfo = loginMapper.findUserByUsername("admin");
		System.out.println(userInfo);
	}




}
