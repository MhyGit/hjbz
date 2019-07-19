package com.hjbz.stuxm.module.echarts.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Qsmyfx  implements Serializable {

	private static final long serialVersionUID = 4308415465483463939L;

	/*交易时间*/
	private String dateKey;

	/*省外购进金额*/
	private String swgjje;

	/*省外销售金额*/
	private String swxsje;

	/*交易省份*/
	private String jysf;

	/*省级代码*/
	private String sjdm;

	/*逆顺差*/
	private String nsc;

}
