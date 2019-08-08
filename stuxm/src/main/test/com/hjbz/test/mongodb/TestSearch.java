package com.hjbz.test.mongodb;

import com.hjbz.stuxm.StuxmApp;
import com.hjbz.stuxm.module.mongodb.dao.QueryMapper;
import com.hjbz.stuxm.module.mongodb.entity.City;
import com.hjbz.stuxm.module.mongodb.entity.County;
import com.hjbz.stuxm.module.mongodb.entity.Province;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StuxmApp.class)
public class TestSearch {

	@Autowired
	private QueryMapper queryMapper;

	@Test
	public void testFindProvinceByCode(){
		Province province = queryMapper.findProvinceByProvinceCode("640000000000");
		System.out.println(province);
	}

	@Test
	public void testFindCityByProvinceCode(){
		 List<City> list = queryMapper.findCityByProvinceCode("640000000000");
		System.out.println(list);
	}

	@Test
	public void testFindCountyByCityCode(){
		List<County> list = queryMapper.findCountyByCityCode("640300000000");
		System.out.println(list);
	}


}
