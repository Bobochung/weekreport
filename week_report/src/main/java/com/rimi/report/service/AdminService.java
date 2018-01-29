package com.rimi.report.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Admin;

public interface AdminService {
	/**
	 * 添加管理员
	 */
	void add(Admin admin);
	
	void addAdmin(Admin admin);
	/**
	 * 删除管理员
	 */
	void delete(int id);
	/**
	 * 更新管理员
	 */
	void update(Admin admin);
	/**
	 * 管理员登录
	 */
	boolean login(HttpServletRequest request);
	
	/**
	 * 管理员注册
	 */
	boolean register(HttpServletRequest request);
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
	
	/**
	 * 根据用户名查询用户唯一性。
	 * @param name
	 * @return 返回admin不为空，则该用户已经注册
	 */
	Admin getByName(String name);
	
	List<Admin> list(HttpServletRequest request,Map<String, Object> map);
	

}
