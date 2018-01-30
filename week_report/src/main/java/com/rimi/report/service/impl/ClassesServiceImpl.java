package com.rimi.report.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Classes;
import com.rimi.report.mapper.ClassesMapper;
import com.rimi.report.service.ClassesService;
import com.rimi.report.util.Keys;

@Service
public class ClassesServiceImpl implements ClassesService {
	
	@Autowired
	ClassesMapper classMapper;

	@Override
	public void add(Classes classes) {
		classMapper.add(classes);

	}

	@Override
	public void delete(int id) {
		classMapper.delete(id);

	}

	@Override
	public void update(Classes classes) {
		classMapper.update(classes);

	}

	@Override
	public int total() {
		
		return classMapper.total();
	}

	@Override
	public List<Classes> list(HttpServletRequest request, Map<String, Object> map) {
		request.getSession().setAttribute(Keys.CLASSES_LIST,classMapper.list(map));	
		return classMapper.list(map);
	}

	@Override
	public Classes getByID(int id ) {
		
		return classMapper.get(id);
	}

	
	

}
