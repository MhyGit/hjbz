package com.hjbz.stuxm.module.mongodb.entity;

import lombok.Data;

import java.io.Serializable;

/**
 *  地区实体类 <br>
 *  Author: news. <br>
 *  Time: 2019年8月7日 <br>
 */
@Data
public class Region implements Serializable {

	private static final long serialVersionUID = 5508735341245634051L;

	/*地区表中id*/
	private Integer provinceId;

	/*地区名称*/
	private String name;

	/*地区代码*/
	private String code;

	/*描述*/
	private String describe;

	/*所属国家名称*/
	private String countryName;

	/*所属国家代码*/
	private String countryCode;

	/*所属国家简称*/
	private String countryReferredName;


}
