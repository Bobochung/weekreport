package com.rimi.report.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Admin;
import com.rimi.report.mapper.AdminMapper;
import com.rimi.report.service.AdminService;
import com.rimi.report.util.Keys;


@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminMapper adminMapper;
	

	@Override
	public void add(Admin admin) {
		adminMapper.add(admin);

	}

	@Override
	public void delete(int id) {
		adminMapper.delete(id);

	}
	
	@Override
	public void update(Admin admin) {
		adminMapper.update(admin);
		
	}
	
	@Override
	public boolean login(HttpServletRequest request) {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(adminMapper.getByName(name) !=null) {
			Admin admin =adminMapper.getByNameandPwd(name,password);
			if(admin.getAdmin_name().equals(name) && admin.getAdmin_password().equals(password)) {
				request.getSession().setAttribute(Keys.ADMIN, admin);
				request.getSession().setAttribute(Keys.LoginType, Keys.ADMIN);
				request.getSession().setAttribute(Keys.ONLINEUSER, name);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean register(HttpServletRequest request) {
				
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(adminMapper.getByName(username) !=null) {
		   return false;
		   
		}else {
			Admin admin2 = new Admin();
			admin2.setAdmin_name(username);
			admin2.setAdmin_password(password);
			
			adminMapper.add(admin2);
			return true;
		}								
	
	}

	@Override
	public int total() {
		
		return adminMapper.total();
	}

	@Override
	public Admin getByID(int id) {
		
		return adminMapper.get(id);
	}

	@Override
	public Admin getByName(String name) {
		
		return adminMapper.getByName(name);
	}

	@Override
	public List<Admin> list(HttpServletRequest request) {
		// TODO Auto-generated method stub
		request.getSession().setAttribute(Keys.ADMIN_LIST,adminMapper.list());	
		return adminMapper.list();
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminMapper.addAdmin(admin);
	}
	
	

}
