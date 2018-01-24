package com.rimi.report.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Admin;
import com.rimi.report.entity.Head;
import com.rimi.report.mapper.HeadMapper;
import com.rimi.report.service.HeadService;
import com.rimi.report.util.Keys;


@Service
public class HeadServiceImpl implements HeadService {
	
	@Autowired
	HeadMapper headMapper;

	@Override
	public void add(Head head) {
		headMapper.add(head);

	}

	@Override
	public void delete(int id) {
		headMapper.delete(id);

	}

	@Override
	public void update(Head head) {
		headMapper.update(head);

	}

	@Override
	public boolean login(HttpServletRequest request) {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(headMapper.getByName(name) !=null) {
			Head head =headMapper.getByNameandPwd(name,password);
			if(head.getHead_name().equals(name) && head.getHead_password().equals(password)) {
				request.getSession().setAttribute(Keys.HEAD, head);
				request.getSession().setAttribute(Keys.LoginType, Keys.HEAD);
				request.getSession().setAttribute(Keys.ONLINEUSER, name);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean register(String name, String password, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int total() {
		
		return headMapper.total();
	}

	@Override
	public Head getByID(int id) {
		
		return headMapper.get(id);
	}

	@Override
	public Head getByName(String name) {
		
		return headMapper.getByName(name);
	}

}
