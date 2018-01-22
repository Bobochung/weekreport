package com.rimi.report.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Head;
import com.rimi.report.mapper.HeadMapper;
import com.rimi.report.service.HeadService;


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
	public Head login(String name, String password, HttpServletRequest request) {
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
