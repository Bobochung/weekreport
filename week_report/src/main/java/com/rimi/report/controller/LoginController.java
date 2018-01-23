package com.rimi.report.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value="login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="main")
	public String index(HttpServletRequest request,ModelMap map) {
		String type = request.getParameter("type");
		String name = request.getParameter("username");
		switch (type) {
		case "admin":			
			if(as.login(request)) {
				
				map.addAttribute(Keys.ADMIN,as.getByName(name));
				map.addAttribute(Keys.LoginType, type);
				map.addAttribute(Keys.ONLINEUSER, as.getByName(name));
							
				return "main";
			}
			else {
				return "login";
			}				
		case "head":
			
			if(hs.login(request)) {
				
				map.addAttribute(Keys.HEAD,hs.getByName(name));
				map.addAttribute(Keys.LoginType, type);
				map.addAttribute(Keys.ONLINEUSER, hs.getByName(name));
				
				return "main";
			}
			else {
				return "login";
			}	
		case "teacher":
		
			if(ts.login(request)) {
				
				map.addAttribute(Keys.TEACHER,ts.getByName(name));
				map.addAttribute(Keys.LoginType, type);
				map.addAttribute(Keys.ONLINEUSER, ts.getByName(name));
				
				return "main";
			}
			else {
				return "login";
			}	
		default:
			return "login";	
		}		
		
		
	}

}
