package com.rimi.report.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.service.ContentService;
import com.rimi.report.util.Keys;

@Controller
public class ReportController {
	@Autowired
	ContentService contentservice;
	
	@RequestMapping("/report")
	public String report() {
		return "report";
	}
	@RequestMapping("/reportlist")
	public String reportlist(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		request.getSession().setAttribute(Keys.CONTENT_LIST, contentservice.list(map));	
		return "reportlist";
	}
}
