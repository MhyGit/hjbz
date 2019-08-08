package com.hjbz.stuxm.module.mongodb.service.impl;

import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.mongodb.dao.QueryMapper;
import com.hjbz.stuxm.module.mongodb.entity.City;
import com.hjbz.stuxm.module.mongodb.entity.County;
import com.hjbz.stuxm.module.mongodb.entity.Province;
import com.hjbz.stuxm.module.mongodb.service.ProvinceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("provinceInfoService")
public class ProvinceInfoServiceImpl implements ProvinceInfoService {

	@Autowired
	private QueryMapper queryMapper;

	@Autowired
	private MongoTemplate mongoTemplate;


	@Override
	public Province findProvinceByProvinceCode(String provinceCode) {
		return queryMapper.findProvinceByProvinceCode(provinceCode);
	}

	@Override
	public List<City> findCityByProvinceCode(String provinceCode) {
		return queryMapper.findCityByProvinceCode(provinceCode);
	}

	@Override
	public List<County> findCountyByCityCode(String cityCode) {
		return queryMapper.findCountyByCityCode(cityCode);
	}

	@Override
	public void insertProvinceInfo(Province province) {
		if (province != null){
			mongoTemplate.insert(province,"province");
		}else {
			throw new RuntimeException("没有从mysql数据库中查到数据...");
		}
	}

	@Override
	public List<Province> queryProvinceInfo(String provinceCode) {
		Query query = new Query();
		if (provinceCode != null) {
			query.addCriteria(Criteria.where("code").is(provinceCode));
		}
		List<Province> list = mongoTemplate.find(query,Province.class,"province");
		if(list.isEmpty()){
			throw new RuntimeException("没有查询到数据");
		}

		return list;
	}
}
