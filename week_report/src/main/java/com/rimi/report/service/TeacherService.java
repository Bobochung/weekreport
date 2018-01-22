package com.rimi.report.service;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Teacher;


public interface TeacherService {
	/**
	 * 添加教师
	 */
	void add(Teacher teacher);
	/**
	 * 删除教师
	 */
	void delete(int id);
	/**
	 * 更新教师
	 */
	void update(Teacher teacher);
	/**
	 * 教师登录
	 */
	Teacher login(String name,String password,HttpServletRequest request);
	
	/**
	 * 教师注册
	 */
	boolean register(String name,String password,HttpServletRequest request);
	/**
	 * 获得教师总数
	 */
	int total();
	/**
	 * 通过ID查询教师
	 * @param id
	 * @return
	 */
	
	Teacher getByID(int id);
	
	/**
	 * 根据用户名查询用户唯一性。
	 * @param name
	 * @return 返回Teacher不为空，则该用户已经注册
	 */
	Teacher getByName(String name);

}
