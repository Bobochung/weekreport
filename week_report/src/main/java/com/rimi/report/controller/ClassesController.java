package com.rimi.report.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.entity.Classes;
import com.rimi.report.service.ClassesService;
import com.rimi.report.util.Keys;


@Controller
public class ClassesController {
	
	@Autowired
	ClassesService cs;
	
	@RequestMapping("classes")
	public String admin(HttpServletRequest request,Map<String, Object> map) {	
	  cs.list(request,map);
	  return "classes";
	}
	
	@RequestMapping("addClasses") 
    public String add(HttpServletRequest request,Map<String, Object> map) { 
		Classes classes = new Classes();
		classes.setClasses(request.getParameter("classes_name"));
		cs.add(classes);
		cs.list(request,map);
		return "classes";
    }
	
	@RequestMapping("deleteClasses")
	public String deleteAdmin(HttpServletRequest request,Map<String, Object> map) {	
	  cs.delete(Integer.parseInt(request.getParameter("classes_id")));
	  cs.list(request,map);
	  return "classes";
	}
	@RequestMapping("updateClasses")
	public String updateAdmin(HttpServletRequest request,Map<String, Object> map) {	
		Classes classes = new Classes();
		classes.setClasses_id(Integer.parseInt(request.getParameter("classes_id")));
	    classes.setClasses(request.getParameter("classes")); 		
		cs.update(classes);
	    cs.list(request,map);
	  return "classes";
	}
	@RequestMapping("update1")
	public String update(HttpServletRequest request) {
		request.getSession().setAttribute(Keys.CLASSES_ITEM, cs.getByID(Integer.parseInt(request.getParameter("cid"))));		
		return "updateClasses";		
	}
	
	@RequestMapping("conditionlist1")
	public String conditionlist1(HttpServletRequest request,Map<String, Object> map) {
		if (request.getParameter("conditionkey1")!=null) {
			map.put(request.getParameter("conditionkey1"), request.getParameter("conditionvalue1"));
		}	
		cs.list(request, map);
		return "classes";		
	}
	

}
