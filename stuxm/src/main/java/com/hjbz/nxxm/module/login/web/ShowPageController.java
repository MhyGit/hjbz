package com.hjbz.nxxm.module.login.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowPageController {

	@RequestMapping("/index")
	public String showIndexPage(){
		return "index";
	}

}
