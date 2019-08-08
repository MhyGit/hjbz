package com.hjbz.stuxm.module.mongodb.service.impl;

import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.mongodb.service.InsertDataInMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service("insertDataInMongoService")
public class InsertDataInMongoServiceImpl implements InsertDataInMongoService {


	@Autowired
	private MongoTemplate mongoTemplate;


	@Override
	public void insertProvinceTradeAnalysis(Qsmyfx qsmyfx) {
		if (qsmyfx != null){
			mongoTemplate.insert(qsmyfx,"qsmyfxdata");
		}else {
			throw new RuntimeException("mysql中的数据为空");
		}

	}
}
