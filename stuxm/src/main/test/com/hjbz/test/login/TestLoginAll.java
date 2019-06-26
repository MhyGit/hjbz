package com.hjbz.test.login;

import com.hjbz.nxxm.StuxmApp;
import com.hjbz.nxxm.module.users.dao.LoginMapper;
import com.hjbz.nxxm.module.users.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StuxmApp.class)
public class TestLoginAll {

	@Autowired
	private LoginMapper loginMapper;

	@Test
	public void testFindUserByPhone(){
		UserInfo userInfo = loginMapper.findUserByPhone("13895207756");
		System.out.println(userInfo);
	}


}
