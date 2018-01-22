package com.rimi.report.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Admin;
import com.rimi.report.mapper.AdminMapper;
import com.rimi.report.service.AdminService;


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
	public Admin login(String name, String password, HttpServletRequest request) {
		
		return null;
	}

	@Override
	public boolean register(String name, String password, HttpServletRequest request) {
		
		return false;
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

	

}
