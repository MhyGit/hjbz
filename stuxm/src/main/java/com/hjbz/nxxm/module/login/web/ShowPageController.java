package com.hjbz.nxxm.module.login.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowPageController {

	/**
	 *  访问首页
	 * @return
	 */
	@RequestMapping("/index")
	public String showIndexPage(){
		return "index";
	}

	/**
	 *  访问登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String showLoginPage(){
		return "login";
	}

}
