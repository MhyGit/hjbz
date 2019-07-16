package com.hjbz.stuxm.module.users.entity;

import lombok.Data;
import org.apache.shiro.crypto.hash.Md5Hash;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 用户基本信息实体类
 */
@Data
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 959379713790495505L;
	/**用户id**/
	private Integer uid;

	/**账号**/
	private String username;

	/**昵称或者真是姓名**/
	private String name;

	/**用户密码**/
	private String pwd;

	/**所属部门id**/
	private Integer doptId;

	/**加密密码用的盐**/
	private String salt;

	/**用户状态：0：创建未认证；1：正常；2：用户被锁定**/
	private byte state;

	/**手机号**/
	private String phone;

	/**邮箱**/
	private String email;

	/**个性签名**/
	private String signature;

	/**生日**/
	private LocalDateTime birthday;

	/**地址**/
	private String address;

	/**创建人名称**/
	private String createName;

	/**创建时间**/
	private LocalDateTime createTime;

	/**操作者**/
	private String operator;

	/**操作时间**/
	private LocalDateTime operatorTime;

	/**操作者ip**/
	private String operatorIp;

	/**备注**/
	private String remark;


	/**
	 * 密码盐.
	 * @return
	 */
	public String getCredentialsSalt(){
		return this.username+this.salt;
	}


	public static void main(String[] args) {
		Md5Hash hash = new Md5Hash("123456","laoma");
		System.out.println(hash.toString());

	}

}
