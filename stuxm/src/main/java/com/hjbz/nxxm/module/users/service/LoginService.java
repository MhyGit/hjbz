package com.hjbz.nxxm.module.users.service;

import com.hjbz.nxxm.module.users.entity.UserInfo;

/**
 * 用于用户登录的service
 */
public interface LoginService {


	/**
	 *  根据手机号查找用户
	 * @param phone 手机号
	 * @return 用户信息实体类
	 */
	UserInfo findUserByPhone(String phone);


}
