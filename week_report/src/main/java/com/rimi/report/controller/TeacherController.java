package com.rimi.report.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.service.TeacherService;
@Controller
public class TeacherController {
	
	@Autowired
	TeacherService ts;
	@RequestMapping("teacher")
	public String admin(HttpServletRequest request) {	
		ts.list(request);
		return "teacher";
	}
}
