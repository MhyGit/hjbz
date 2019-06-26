package com.hjbz.nxxm.module.users.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户信息实体类
 */
@Data
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 7185116645635674259L;
	private Integer id;
	private String username;
	private String password;
	private String phone;
	private Integer age;
	private char sex;
	private String email;
	private String address;
	private Timestamp createTime;

	public UserInfo() {
	}

	public UserInfo(Integer id, String username, String password, String phone, Integer age, char sex, String email, String address, Timestamp createTime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.address = address;
		this.createTime = createTime;
	}


}
