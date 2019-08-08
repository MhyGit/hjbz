package com.hjbz.stuxm.module.mongodb.web;


import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.mongodb.service.SearchDataOnMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchDataOnMongoController {


	@Autowired
	private SearchDataOnMongoService searchDataOnMongoService;

	@RequestMapping("/searchProvinceTradeAnalysis")
	@ResponseBody
	public String searchProvinceTradeAnalysis(String provinceName){
		System.out.println(provinceName);
		List<Qsmyfx> list = searchDataOnMongoService.searchDataOnMongo(provinceName);
		return list.toString();
	}


}
