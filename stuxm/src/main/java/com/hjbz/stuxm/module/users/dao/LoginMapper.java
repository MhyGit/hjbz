package com.hjbz.stuxm.module.users.dao;

import com.hjbz.stuxm.module.users.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 用户登录持久层接口
 * @Auther nxxm
 */
@Mapper
@Component
public interface LoginMapper {

	/**
	 *  根据手机号查找用户
	 * @param phone 手机号
	 * @return 用户信息实体类
	 */
	UserInfo findUserByPhone(String phone);

	/**
	 *  根据用户名查找用户
	 * @param username 用户名
	 * @return 用户信息实体类
	 */
	UserInfo findUserByUsername(String username);




}
