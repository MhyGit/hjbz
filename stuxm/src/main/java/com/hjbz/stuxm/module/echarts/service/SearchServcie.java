package com.hjbz.stuxm.module.echarts.service;

import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;

import java.util.List;

public interface SearchServcie {

	/**
	 * 按条件查询数据
	 * @param paramter
	 * @return
	 */
	List<Qsmyfx> findAllData(Paramter paramter);

}
