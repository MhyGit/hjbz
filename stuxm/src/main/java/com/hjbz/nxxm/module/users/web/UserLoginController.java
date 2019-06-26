package com.hjbz.nxxm.module.users.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserLoginController {

	/**
	 *  访问登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView showLoginPage(){
		return new ModelAndView("login");
	}




}
