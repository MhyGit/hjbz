package com.hjbz.stuxm.module.echarts.web;

import com.hjbz.stuxm.global.entity.MsgInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sun.security.pkcs11.Secmod;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class EchartsController {

	@RequestMapping("/showHistogram")
	public ModelAndView showHistogram(){
		return new ModelAndView("echarts/demo");
	}

	@RequestMapping("/showChinaMap")
	public ModelAndView showChinaMap(){
		return new ModelAndView("echarts/chinaMap");
	}

}
