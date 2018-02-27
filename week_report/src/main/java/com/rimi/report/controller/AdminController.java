package com.rimi.report.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.entity.Admin;
import com.rimi.report.service.AdminService;
import com.rimi.report.util.Keys;

@Controller
public class AdminController {
	
	@Autowired
	AdminService as;
	
	@RequestMapping("admin")
	public String admin(HttpServletRequest request,Map<String, Object> map) {	
	  as.list(request,map);
	  return "admin";
	}
	
	@RequestMapping("addAdmin") 
    public String add(HttpServletRequest request,Map<String, Object> map,Admin admin) { 
//		Admin admin = new Admin();
//		admin.setAdmin_name(request.getParameter("admin_name"));
//		admin.setAdmin_password(request.getParameter("admin_password"));
//		admin.setAdmin_tel(request.getParameter("admin_tel"));
		as.addAdmin(admin);
		as.list(request,map);
		return "admin";
    }
	
	@RequestMapping("deleteAdmin")
	public String deleteAdmin(HttpServletRequest request,Map<String, Object> map,Admin admin) {	
	  as.delete(admin.getAid());
	  as.list(request,map);
	  return "admin";
	}
	@RequestMapping("updateAdmin")
	public String updateAdmin(HttpServletRequest request,Map<String, Object> map,Admin admin) {	
//		Admin admin = new Admin();
//		admin.setAid(Integer.parseInt(request.getParameter("aid")));
//		admin.setAdmin_name(request.getParameter("admin_name"));
//		admin.setAdmin_password(request.getParameter("admin_password"));
//		admin.setAdmin_tel(request.getParameter("admin_tel"));
		as.update(admin);
	  as.list(request,map);
	  return "admin";
	}
	
	@RequestMapping("update")
	public String update(HttpServletRequest request) {
		request.getSession().setAttribute(Keys.ADMINITEM, as.getByID(Integer.parseInt(request.getParameter("aid"))));
		return "updateAdmin";		
	}
	
	@RequestMapping("admin/conditionlist")
	public String conditionlist(HttpServletRequest request,Map<String, Object> map) {
		if (request.getParameter("conditionkey")!=null) {
			map.put(request.getParameter("conditionkey"), request.getParameter("conditionvalue"));
		}	
		as.list(request, map);
		return "admin";		
	}
	
	

}
