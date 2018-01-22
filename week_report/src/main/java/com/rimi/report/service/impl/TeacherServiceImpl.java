package com.rimi.report.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Teacher;
import com.rimi.report.mapper.TeacherMapper;
import com.rimi.report.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	TeacherMapper teacherMapper;

	@Override
	public void add(Teacher teacher) {
		teacherMapper.add(teacher);
		
	}

	@Override
	public void delete(int id) {
		teacherMapper.delete(id);
		
	}

	@Override
	public void update(Teacher teacher) {
		teacherMapper.update(teacher);
		
	}

	@Override
	public Teacher login(String name, String password, HttpServletRequest request) {
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
		
		return teacherMapper.total();
	}

	@Override
	public Teacher getByID(int id) {
		
		return teacherMapper.get(id);
	}

	@Override
	public Teacher getByName(String name) {
		
		return teacherMapper.getByName(name);
	}

}
