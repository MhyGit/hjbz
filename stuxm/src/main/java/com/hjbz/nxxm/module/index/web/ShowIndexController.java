package com.hjbz.nxxm.module.index.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowIndexController {

	/**
	 *  访问首页
	 * @return
	 */
	@RequestMapping("/index")
	public String showIndexPage(){
		return "index";
	}
}
