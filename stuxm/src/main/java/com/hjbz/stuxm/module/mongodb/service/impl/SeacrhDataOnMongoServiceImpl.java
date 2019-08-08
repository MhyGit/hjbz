package com.hjbz.stuxm.module.mongodb.service.impl;

import com.github.pagehelper.util.StringUtil;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.mongodb.service.SearchDataOnMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("searchDataOnMongoService")
public class SeacrhDataOnMongoServiceImpl implements SearchDataOnMongoService {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Qsmyfx> searchDataOnMongo(String provinceName) {
		Query query = new Query();
		if (provinceName != null) {
			query.addCriteria(Criteria.where("jysf").is(provinceName));
		}
		query.with(new Sort(Sort.Direction.DESC, "swgjje"));
		List<Qsmyfx> list = mongoTemplate.find(query,Qsmyfx.class,"qsmyfxdata");
		if(list.isEmpty()){
			throw new RuntimeException("没有查询到数据");
		}
		return list;
	}
}
