package com.rimi.report.service;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Admin;

public interface AdminService {
	/**
	 * 添加管理员
	 */
	void add(Admin admin);
	/**
	 * 删除管理员
	 */
	void delete(Admin admin);
	/**
	 * 更新管理员
	 */
	void update(Admin admin);
	/**
	 * 管理员登录
	 */
	Admin login(String name,String password,HttpServletRequest request);
	
	/**
	 * 管理员注册
	 */
	boolean register(String name,String password,HttpServletRequest request);
	/**
	 * 获得管理员总数
	 */
	int total();
	/**
	 * 根据ID得到管理员
	 * @param id
	 * @return
	 */
	
	Admin getByID(int id);
	

}
