package com.rimi.report.controller;


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
	public String admin(HttpServletRequest request) {	
	  as.list(request);
	  return "admin";
	}
	
	@RequestMapping("addAdmin") 
    public String add(HttpServletRequest request) { 
		Admin admin = new Admin();
		admin.setAdmin_name(request.getParameter("admin_name"));
		admin.setAdmin_password(request.getParameter("admin_password"));
		admin.setAdmin_tel(request.getParameter("admin_tel"));
		as.addAdmin(admin);
		as.list(request);
		return "admin";
    }
	
	@RequestMapping("deleteAdmin")
	public String deleteAdmin(HttpServletRequest request) {	
	  as.delete(Integer.parseInt(request.getParameter("aid")));
	  as.list(request);
	  return "admin";
	}
	@RequestMapping("updateAdmin")
	public String updateAdmin(HttpServletRequest request) {	
		Admin admin = new Admin();
		admin.setAid(Integer.parseInt(request.getParameter("aid")));
		admin.setAdmin_name(request.getParameter("admin_name"));
		admin.setAdmin_password(request.getParameter("admin_password"));
		admin.setAdmin_tel(request.getParameter("admin_tel"));
		as.update(admin);
	  as.list(request);
	  return "admin";
	}
	
	@RequestMapping("update")
	public String update(HttpServletRequest request) {
		request.getSession().setAttribute(Keys.ADMINITEM, as.getByID(Integer.parseInt(request.getParameter("aid"))));
		return "updateAdmin";		
	}
	
	

}
