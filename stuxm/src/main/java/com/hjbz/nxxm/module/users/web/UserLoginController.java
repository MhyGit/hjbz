package com.hjbz.nxxm.module.users.web;


import com.hjbz.nxxm.global.entity.MsgInfo;
import com.hjbz.nxxm.module.users.entity.UserInfo;
import com.hjbz.nxxm.module.users.service.LoginService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/login")
public class UserLoginController {

	@Resource(name = "loginService")
	private LoginService loginService;

	/**
	 *  访问登录页面
	 * @return
	 */
	@RequestMapping("/loginPage")
	public ModelAndView showLoginPage(){
		return new ModelAndView("login");
	}

	@RequestMapping("/goSuccess")
	public ModelAndView goSuccess(){
		return new ModelAndView("loginSuccess");
	}


	@RequestMapping(value = "/userLogin",method = RequestMethod.POST)
	public MsgInfo userLogin(UserInfo userInfo, HttpServletRequest request){
		MsgInfo msgInfo = null;
		if (userInfo == null){
			return new MsgInfo(MsgInfo.ERROR_CODE,"参数为空...",null,LocalDate.from(LocalDateTime.now()));
		}

		UserInfo user = loginService.findUserByPhone(userInfo.getPhone());
		if (user == null){
			return new MsgInfo(MsgInfo.ERROR_CODE,"用户不存在...",null,LocalDate.from(LocalDateTime.now()));
		}
		if (!user.getPwd().equals(userInfo.getPwd())){
			return new MsgInfo(MsgInfo.ERROR_CODE,"密码不正确...",null,LocalDate.from(LocalDateTime.now()));
		}
		HttpSession session = request.getSession();
		System.out.println(user);
		session.setAttribute("user:",user);
		session.setMaxInactiveInterval(180);
		System.out.println(session.getId());
//		session.setAttribute("username:",user.getUsername());
//		session.setAttribute("phone:",user.getPhone());
//		session.setAttribute("pwd:",user.getPwd());
//		session.setAttribute("email:",user.getEmail());
		System.out.println("====================>>>>>"+session.getAttribute("user"));
		return new MsgInfo(MsgInfo.SUCCESS_CODE,"登录成功...",user,LocalDate.from(LocalDateTime.now()));
	}

}
