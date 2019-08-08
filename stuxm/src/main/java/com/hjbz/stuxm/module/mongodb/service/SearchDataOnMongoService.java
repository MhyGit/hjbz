package com.hjbz.stuxm.module.mongodb.service;

import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.mongodb.entity.City;

import java.util.List;

public interface SearchDataOnMongoService {


	/**
	 *  根据省份名称查询数据 <br>
	 * Time:2019年8月6日<br>
	 * Author：news.<br>
	 * @param provinceName  省份名称
	 * @return
	 */
	List<Qsmyfx> searchDataOnMongo(String provinceName);


}
