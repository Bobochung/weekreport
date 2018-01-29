package com.rimi.report.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Classes;
import com.rimi.report.mapper.ClassesMapper;
import com.rimi.report.service.ClassesService;

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
	public List<Classes> list() {
		
		return classMapper.list();
	}

	@Override
	public Classes getByID(int id ) {
		
		return classMapper.get(id);
	}

}
