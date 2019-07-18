package com.hjbz.stuxm.module.echarts.web;

import com.hjbz.stuxm.global.entity.MsgInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/search")
public class SearchMapDataController {


	@RequestMapping("/allData")
	public MsgInfo allData(){
		return new MsgInfo(MsgInfo.SUCCESS_CODE,"查询成功",null, LocalDateTime.now());
	}

}
