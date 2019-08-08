package com.hjbz.stuxm.module.mongodb.entity;

import lombok.Data;

import java.io.Serializable;

/**
 *  县级地区实体类 <br>
 *  Author: news. <br>
 *  Time: 2019年8月7日 <br>
 */
@Data
public class County implements Serializable {

	private static final long serialVersionUID = 5207939528897980386L;

	/*表中id*/
	private Integer countyId;

	/*县级地区名称*/
	private String name;

	/*县级地区代码*/
	private String code;

	/*所属市名称*/
	private String cityName;

	/*所属市代码*/
	private String cityCode;

	/*所属省份名称*/
	private String provinceName;

	/*所属省份代码*/
	private String provinceCode;

	/*下辖的乡镇*/
	private String towns;

	/*描述*/
	private String describe;




}























