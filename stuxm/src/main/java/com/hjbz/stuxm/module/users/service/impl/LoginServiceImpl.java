package com.hjbz.stuxm.module.users.service.impl;

import com.hjbz.stuxm.module.users.dao.LoginMapper;
import com.hjbz.stuxm.module.users.entity.UserInfo;
import com.hjbz.stuxm.module.users.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Resource(name = "loginMapper")
	private LoginMapper loginMapper;


	@Override
	public UserInfo findUserByPhone(String phone) {
		return loginMapper.findUserByPhone(phone);
	}



}
