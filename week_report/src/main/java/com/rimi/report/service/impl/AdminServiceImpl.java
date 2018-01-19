package com.rimi.report.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Admin;
import com.rimi.report.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public void add(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public Admin login(String name, String password, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean register(String name, String password, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Admin getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
