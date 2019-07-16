package com.hjbz.stuxm.global.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 后端响应前端的实体类
 */
@Data
public class MsgInfo implements Serializable {

	private static final long serialVersionUID = -8752828576138983431L;

	/** 表示响应成功的代码**/
	public static final Integer SUCCESS_CODE = 1;

	/** 表示响应失败的代码**/
	public static final Integer ERROR_CODE = -1;

	/**响应是否成功代码：1、成功；-1、失败；**/
	private Integer code;

	/**响应提示信息**/
	private String msg;

	/**响应给前端的数据**/
	private Object data;

	/**响应时间**/
	private LocalDate repTime;


	public MsgInfo() {
	}

	public MsgInfo(Integer code, String msg, Object data, LocalDate repTime) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.repTime = repTime;
	}


}
