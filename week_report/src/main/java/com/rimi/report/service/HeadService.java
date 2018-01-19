package com.rimi.report.service;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Head;

public interface HeadService {
	/**
	 * 添加主管
	 */
	void add(Head head);
	/**
	 * 删除主管
	 */
	void delete(Head head);
	/**
	 * 更新主管
	 */
	void update(Head head);
	/**
	 * 主管登录
	 */
	Head login(String name,String password,HttpServletRequest request);
	
	/**
	 * 主管注册
	 * 
	 */
	boolean register(String name,String password,HttpServletRequest request);
	/**
	 * 获得主管总数
	 */
	int total();
	/**
	 * 通过ID查询主管
	 * @param id
	 * @return
	 */
	
	Head getByID(int id);

}
