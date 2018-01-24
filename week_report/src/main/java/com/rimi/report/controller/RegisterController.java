package com.rimi.report.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.service.AdminService;
import com.rimi.report.service.HeadService;
import com.rimi.report.service.TeacherService;

@Controller
public class RegisterController {
	
	@Autowired
	AdminService as;
	@Autowired
	HeadService hs;
	@Autowired
	TeacherService ts;
	
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("success")
	public String index(HttpServletRequest request) {
		String type = request.getParameter("type");
		System.out.println(type);
		switch (type) {
		case "admin":			
			if(as.register(request)) {								
				return "success";
			}
			else {
				return "register";
			}				
		case "head":
			
			if(hs.register(request)) {
				
				return "success";
			}
			else {
				return "register";
			}	
		case "teacher":
		
			if(ts.register(request)) {
				
				return "success";
			}
			else {
				return "register";
			}	
		default:
			return "register";	
		}		
		
		
	}
	
	
	

}
