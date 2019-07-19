package com.hjbz.stuxm.module.echarts.web;

import com.hjbz.stuxm.global.entity.MsgInfo;
import com.hjbz.stuxm.module.echarts.entity.Paramter;
import com.hjbz.stuxm.module.echarts.entity.Qsmyfx;
import com.hjbz.stuxm.module.echarts.service.SearchServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchMapDataController {

	@Autowired
	private SearchServcie searchServcie;

	@RequestMapping(value = "/allData",method = RequestMethod.POST)
	public MsgInfo allData(Paramter paramter){
		paramter.setSsqq(formateDate(paramter.getSsqq()));
		paramter.setSsqz(formateDate(paramter.getSsqz()));
		List<Qsmyfx> list = searchServcie.findAllData(paramter);
		return new MsgInfo(MsgInfo.SUCCESS_CODE,"查询成功",list, LocalDateTime.now());
	}




	private String formateDate(String str){
		str = str.replace("-","");
		return str;
	}

}
