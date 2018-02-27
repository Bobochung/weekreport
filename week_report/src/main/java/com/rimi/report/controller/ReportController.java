package com.rimi.report.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.modeler.modules.ModelerSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String reportlist(HttpServletRequest request) {	
		Map<String,Map<String, Object>> condition = new HashMap<>();
		Map<String,Object> map = new HashMap<>();
		condition.put(Keys.CONTENT_LIST, map);
		contentservice.getReports(condition, request);
		return "reportlist";
	}
	@RequestMapping("/reportitem")
	public String reportitem(HttpServletRequest request) {
		//本周情况
		Map<String,Object> CurrentCon = new HashMap<>();
		CurrentCon.put("type", "condition");
		CurrentCon.put("teacher_id", Integer.parseInt(request.getParameter("tid")));
		CurrentCon.put("classes_id", Integer.parseInt(request.getParameter("classes_id")));
		CurrentCon.put("beginTime", request.getParameter("beginTime"));
		//System.out.println(request.getParameter("beginTime"));
		//System.out.println(request.getParameter("endTime"));
		CurrentCon.put("endTime", request.getParameter("endTime"));	
		
		//本周问题
		Map<String,Object> CurrentPro = new HashMap<>();
		CurrentPro.put("type", "problem");
		CurrentPro.put("teacher_id", Integer.parseInt(request.getParameter("tid")));
		CurrentPro.put("classes_id", Integer.parseInt(request.getParameter("classes_id")));
		CurrentPro.put("beginTime", request.getParameter("beginTime"));
		CurrentPro.put("endTime", request.getParameter("endTime"));
		
		//下周情况
		Map<String,Object> NextCon = new HashMap<>();
		NextCon.put("type", "condition");
		NextCon.put("teacher_id", Integer.parseInt(request.getParameter("tid")));
		NextCon.put("classes_id", Integer.parseInt(request.getParameter("classes_id")));
		NextCon.put("nextTime", request.getParameter("endTime"));
						
		//下周问题
		Map<String,Object> NextPro = new HashMap<>();
		NextPro.put("type", "problem");
		NextPro.put("teacher_id", Integer.parseInt(request.getParameter("tid")));
		NextPro.put("classes_id", Integer.parseInt(request.getParameter("classes_id")));
		NextPro.put("nextTime", request.getParameter("endTime"));
		
		Map<String,Map<String, Object>> condition = new HashMap<>();
		condition.put(Keys.CURRENTCONTENTCON_LIST,CurrentCon);
		condition.put(Keys.CURRENTCONTENTPRO_LIST,CurrentPro);
		condition.put(Keys.NEXTCONTENTCON_LIST,NextCon);
		condition.put(Keys.NEXTCONTENTPRO_LIST,NextPro);
		
		contentservice.getReports(condition,request);
		
		return "report";
	}
	
	@RequestMapping("addreport")
	public String addreport(HttpServletRequest request) {	
		contentservice.add(request.getParameter("content"),
				request.getParameter("type"),
				request.getParameter("date"),
				Integer.parseInt(request.getParameter("part_id")),
				Integer.parseInt(request.getParameter("classes_id")),
				Integer.parseInt(request.getParameter("teacher_id")));	
		return "report";
	}
	
	@RequestMapping("deletereport")
	public String deletereport(HttpServletRequest request) {
		contentservice.delete(Integer.parseInt(request.getParameter("cid")));
		return "redirect:/reportlist";
	}
	
	
}
