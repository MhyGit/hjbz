package com.hjbz.nxxm.module.users.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * 角色信息实体类
 */
@Data
public class SysRole implements Serializable {

	private static final long serialVersionUID = -5184901997861821436L;
	/**角色id**/
	private Integer rid;

	/**角色名称**/
	private String roleName;

	/**角色描述**/
	private String description;

	/**角色状态：1：可用；0：不可用**/
	private Integer available;




}
