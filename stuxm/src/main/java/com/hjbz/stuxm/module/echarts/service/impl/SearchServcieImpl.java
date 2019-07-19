package com.hjbz.stuxm.module.echarts.service.impl;

import com.hjbz.stuxm.module.echarts.dao.SearchMapper;
import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.echarts.service.SearchServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServcieImpl implements SearchServcie {

	@Autowired
	private SearchMapper searchMapper;

	@Override
	public List<Qsmyfx> findAllData(Paramter paramter) {
		return searchMapper.findAllData(paramter);
	}
}
