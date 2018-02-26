package com.rimi.report.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.entity.Head;
import com.rimi.report.entity.Part;
import com.rimi.report.service.HeadService;
import com.rimi.report.service.PartService;
import com.rimi.report.util.Keys;
@Controller
public class HeadController {
	
	@Autowired
	HeadService hs;
	@Autowired
	PartService ps;
	
	@RequestMapping("head")
	public String headlist(HttpServletRequest request,Map<String, Object> map ) {
		hs.list(request, map);
		return "head";
	}
	
	@RequestMapping("addHead") 
    public String add(HttpServletRequest request,Map<String, Object> map) { 
		Head head = new Head();
		head.setHead_name(request.getParameter(""));
		head.setHead_password(request.getParameter(""));
		head.setHead_tel(request.getParameter(""));
		head.setPart(ps.getByID(Integer.parseInt(request.getParameter(""))));	
		hs.list(request,map);
		return "head";
    }
	
	@RequestMapping("deleteHead")
	public String deleteHead(HttpServletRequest request,Map<String, Object> map) {	
	  hs.delete(Integer.parseInt(request.getParameter("hid")));
	  hs.list(request,map);
	  return "head";
	}
	@RequestMapping("updatehead")
	public String updateH(HttpServletRequest request,Map<String, Object> map) {	
		Head head = new Head();
		head.setHead_name(request.getParameter("head_name"));
		head.setHead_password(request.getParameter("head_password"));
		head.setHead_tel(request.getParameter("head_tel"));
		//part.setPart_name(request.getParameter("part_name"));
		//head.setPart(ps.getByID(Integer.parseInt(request.getParameter(""))));
	    hs.list(request,map);
	  return "head";
	}
	@RequestMapping("updateH")
	public String updatehead(HttpServletRequest request) {
		request.getSession().setAttribute(Keys.HEAD_ITEM, hs.getByID(Integer.parseInt(request.getParameter("hid"))));		
		return "updateHead";		
	}
	
	@RequestMapping("conditionlistHead")
	public String conditionlistHead(HttpServletRequest request,Map<String, Object> map) {
		if (request.getParameter("conditionHkey")!=null) {
			map.put(request.getParameter("conditionHkey"), request.getParameter("conditionHvalue"));
		}	
		hs.list(request, map);
		return "head";		
	}
}
