package com.hjbz.stuxm.module.mongodb.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  市实体类 <br>
 *  Author: news. <br>
 *  Time: 2019年8月7日 <br>
 */
@Data
public class City  implements Serializable {

	private static final long serialVersionUID = -8149602975069411991L;

	/*市表中id*/
	private Integer cityId;

	/*市名称*/
	private String name;

	/*市简称*/
	private String referred;

	/*市代码*/
	private String code;

	/*邮政编码*/
	private String postalCode;

	/*车牌号*/
	private String licensePlate;

	/*电话区号*/
	private String telephoneAreaCode;

	/*所属省份代码*/
	private String provinceCode;

	/*所属省份名称*/
	private String provinceName;

	/*所属省份简称*/
	private String provinceReferred;

	/*所属地区名称*/
	private String regionName;

	/*所属地区代码*/
	private String regionCode;

	/*所属国家简称*/
	private String countryReferredName;

	/*所属国家代码*/
	private String countryCode;

	/*封装下辖县的list*/
	private List<County> countyList;





}

