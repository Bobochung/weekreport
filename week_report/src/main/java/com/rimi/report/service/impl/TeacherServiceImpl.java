package com.rimi.report.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Admin;
import com.rimi.report.entity.Head;
import com.rimi.report.entity.Teacher;
import com.rimi.report.mapper.TeacherMapper;
import com.rimi.report.service.TeacherService;
import com.rimi.report.util.Keys;

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
	public boolean login(HttpServletRequest request) {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(teacherMapper.getByName(name) !=null) {
			Teacher teacher =teacherMapper.getByNameandPwd(name,password);
			if(teacher.getTeacher_name().equals(name) && teacher.getTeacher_password().equals(password)) {
				request.getSession().setAttribute(Keys.TEACHER, teacher);
				request.getSession().setAttribute(Keys.LoginType, Keys.TEACHER);
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
		
		if(teacherMapper.getByName(username) !=null) {
		   return false;
		   
		}else {
			Teacher t = new Teacher();
			t.setTeacher_name(username);
			t.setTeacher_password(password);
			
			return true;
		}
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
