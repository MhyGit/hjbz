package com.hjbz.stuxm.module.echarts.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Paramter implements Serializable {

	private static final long serialVersionUID = -7051203607394419065L;

	/*交易省份*/
	private String jysf;

	/*所属期起*/
	private String ssqq;

	/*所属期止*/
	private String ssqz;

	/*关系类型：1-购进，2-销售*/
	private Integer gxlx;




}
