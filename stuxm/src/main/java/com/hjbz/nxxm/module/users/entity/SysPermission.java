package com.hjbz.nxxm.module.users.entity;

import lombok.Data;

import java.io.Serializable;

/**
 *  权限信息实体类
 */
@Data
public class SysPermission implements Serializable {

	private static final long serialVersionUID = -2612860206373668506L;
	/**权限id**/
	private Integer pid;

	/**权限名称**/
	private String permissionNname;

	/**权限描述**/
	private String description;

	/**权限状态：1：可用；0：不可用**/
	private Integer available;


}
