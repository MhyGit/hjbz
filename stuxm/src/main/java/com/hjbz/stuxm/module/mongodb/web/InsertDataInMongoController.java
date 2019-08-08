package com.hjbz.stuxm.module.mongodb.web;


import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.echarts.service.SearchServcie;
import com.hjbz.stuxm.module.mongodb.service.InsertDataInMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/insertMongodb")
public class InsertDataInMongoController {

	@Autowired
	private SearchServcie searchServcie;

	@Autowired
	private InsertDataInMongoService insertDataInMongoService;


	@RequestMapping(value = "/insertProvinceTradeAnalysis",method = RequestMethod.GET)
	@ResponseBody
	public String insertProvinceTradeAnalysis(){
		Paramter paramter = new Paramter();

		paramter.setSsqz("201907");
		paramter.setSsqq("201901");
		List<Qsmyfx> list = searchServcie.findAllData(paramter);

		for (Qsmyfx qsmyfx:list){
			insertDataInMongoService.insertProvinceTradeAnalysis(qsmyfx);
		}

		return list.toString();
	}




}
