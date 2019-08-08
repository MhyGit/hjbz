package com.hjbz.stuxm.module.mongodb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  省份实体类 <br>
 *  Author: news. <br>
 *  Time: 2019年8月7日 <br>
 */
@Data
public class Province implements Serializable {

	private static final long serialVersionUID = -7796714029627220108L;

	/*省份表中id*/
	private Integer provinceId;

	/*省份名称*/
	private String name;

	/*省份简称*/
	private String referred;

	/*省份代码*/
	private String code;

	/*所属地区名称*/
	private String regionName;

	/*所属地区代码*/
	private String regionCode;

	/*所属国家名称*/
	private String countryName;

	/*所属国家代码*/
	private String countryCode;

	/*描述*/
	private String describe;

	/*所属国家简称*/
	private String countryReferredName;

	/*封装下辖市的list*/
	private List<City> cityList;

}
