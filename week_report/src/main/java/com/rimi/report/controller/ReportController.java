package com.rimi.report.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.service.ContentService;
import com.rimi.report.service.TeacherService;
import com.rimi.report.util.Keys;

@Controller
public class ReportController {
	@Autowired
	ContentService contentservice;
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping("/report")
	public String report(HttpServletRequest request,Map<String,Object> map) {
		request.getSession().setAttribute(Keys.TEACHER_ITEM, teacherService.getByID(Integer.parseInt(request.getParameter("tid"))));
		return "report";
	}
	@RequestMapping("/reportlist")
	public String reportlist(HttpServletRequest request,Map<String,Object> map) {
		request.getSession().setAttribute(Keys.CONTENT_LIST, contentservice.list(request,map));	
		return "reportlist";
	}
}
