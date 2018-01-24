package com.rimi.report.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

import com.rimi.report.service.AdminService;
import com.rimi.report.service.HeadService;
import com.rimi.report.service.TeacherService;
import com.rimi.report.util.Keys;



@Controller
public class LoginController {
	
	@Autowired
	AdminService as;
	@Autowired
	HeadService hs;
	@Autowired
	TeacherService ts;
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="main")
	public String index(HttpServletRequest request) {
		String type = request.getParameter("type");
		switch (type) {
		case "admin":			
			if(as.login(request)) {								
				return "main";
			}
			else {
				return "login";
			}				
		case "head":
			
			if(hs.login(request)) {
				
				return "main";
			}
			else {
				return "login";
			}	
		case "teacher":
		
			if(ts.login(request)) {
				
				return "main";
			}
			else {
				return "login";
			}	
		default:
			return "login";	
		}		
		
		
	}
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}
	
	

}
