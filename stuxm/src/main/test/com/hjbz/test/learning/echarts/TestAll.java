package com.hjbz.test.learning.echarts;


import com.hjbz.stuxm.StuxmApp;
import com.hjbz.stuxm.module.echarts.dao.SearchMapper;
import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StuxmApp.class)
public class TestAll {

	@Autowired
	private SearchMapper searchMapper;

	@Test
	public void testFindAllData(){
		Paramter paramter = new Paramter();
		paramter.setSsqq("201901");
		paramter.setSsqz("201902");
		List<Qsmyfx> list = searchMapper.findAllData(paramter);
		list.forEach(System.out::println);

	}


}
