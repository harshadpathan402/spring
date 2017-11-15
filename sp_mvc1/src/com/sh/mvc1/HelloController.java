package com.sh.mvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sp.hb.services.EmployeeService;

@Controller
public class HelloController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/welcome")
	public String gotoPage1() {
		return "page1";
	}
	@RequestMapping("/next")
	public String gotoPage2() {
		return "page2";
	}
	@RequestMapping("/login")
	public String doLogin(LoginModel lm) {
		System.out.println("doLogin() called : " + lm);
		return "page3";
	}
}



