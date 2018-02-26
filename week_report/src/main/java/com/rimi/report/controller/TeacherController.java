package com.rimi.report.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.entity.Classes;
import com.rimi.report.entity.Part;
import com.rimi.report.service.ClassesService;
import com.rimi.report.service.PartService;
import com.rimi.report.service.TeacherService;
@Controller
public class TeacherController {
	
	@Autowired
	TeacherService ts;
	@Autowired
	PartService ps;
	@Autowired
	ClassesService cs;
	@RequestMapping("teacher")
	public String admin(HttpServletRequest request,Map<String, Object> map) {	
		ts.list(request,map);
		return "teacher";
	}
	@RequestMapping("teacher/conditionlist")
	public String conditionlist(HttpServletRequest request,Map<String, Object> map) {
		if (request.getParameter("conditionkey")!=null) {
			
			map.put(request.getParameter("conditionkey"), request.getParameter("conditionvalue"));
		}		
		ts.list(request, map);
		return "teacher";
	}
	@RequestMapping("deleteteacher")
	public String deleteteacher(HttpServletRequest request,Map<String, Object> map) {	
		ts.delete(Integer.parseInt(request.getParameter("tid")));
		ts.list(request,map);
		return "teacher";
	}
	@RequestMapping("updateteacher")
	public String updateteacher(HttpServletRequest request,Map<String, Object> map) {			
		return "updateTeacher";
	}
	@RequestMapping("partlist")
	public String partlist(HttpServletRequest request) {	
		List<Part> list = new ArrayList<>();
		for(Part part :ps.list(request, new HashMap<>()) ) {
			list.add(part);
		}	
		request.getSession().setAttribute("partlist", list);
		return "teacher";
	}
	@RequestMapping("clalist")
	public String clalist(HttpServletRequest request) {	
		List<Classes> list = new ArrayList<>();
		for(Classes classes :cs.list(request, new HashMap<>()) ) {
			list.add(classes);
		}	
		request.getSession().setAttribute("clalist", list);
		return "teacher";
	}
	
	
}
