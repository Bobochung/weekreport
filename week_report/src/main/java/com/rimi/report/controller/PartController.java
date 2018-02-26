package com.rimi.report.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.entity.Classes;
import com.rimi.report.entity.Part;
import com.rimi.report.service.PartService;
import com.rimi.report.util.Keys;

@Controller
public class PartController {
	
	@Autowired
	PartService ps;
	
	@RequestMapping("part")
	public String admin(HttpServletRequest request,Map<String, Object> map) {	
		
		
	  ps.list(request,map);
	  return "part";
	}
	
	@RequestMapping("addPart") 
    public String add(HttpServletRequest request,Map<String, Object> map) { 
		Part part = new Part();
		part.setPart_name(request.getParameter("part_name"));
		ps.add(part);
		ps.list(request,map);
		return "part";
    }
	
	@RequestMapping("deletePart")
	public String deleteAdmin(HttpServletRequest request,Map<String, Object> map) {	
	  ps.delete(Integer.parseInt(request.getParameter("pid")));
	  ps.list(request,map);
	  return "part";
	}
	@RequestMapping("updatePart")
	public String updateAdmin(HttpServletRequest request,Map<String, Object> map) {	
		Part part = new Part();
		part.setPid(Integer.parseInt(request.getParameter("pid")));
		part.setPart_name(request.getParameter("part_name"));			
		ps.update(part);
	    ps.list(request,map);
	  return "part";
	}
	@RequestMapping("updateTwo")
	public String update(HttpServletRequest request) {
		request.getSession().setAttribute(Keys.PART_ITEM, ps.getByID(Integer.parseInt(request.getParameter("pid"))));		
		return "updatePart";		
	}
	
	@RequestMapping("conditionlistTwo")
	public String conditionlist1(HttpServletRequest request,Map<String, Object> map) {
		if (request.getParameter("conditionkeyTwo")!=null) {
			map.put(request.getParameter("conditionkeyTwo"), request.getParameter("conditionvalueTwo"));
		}	
		ps.list(request, map);
		return "part";		
	}
	

}
