package com.rimi.report.service;

import java.util.List;
import java.util.Map;

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
	void delete(int id);
	/**
	 * 更新主管
	 */
	void update(Head head);
	/**
	 * 主管登录
	 */
	boolean login(HttpServletRequest request);
	
	/**
	 * 主管注册
	 * 
	 */
	boolean register(HttpServletRequest request);
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
	
	/**
	 * 根据用户名查询用户唯一性。
	 * @param name
	 * @return 返回Head不为空，则该用户已经注册
	 */
	Head getByName(String name);
	
	/**
	 * 得到主管列表
	 */
	List<Head> list(HttpServletRequest request,Map<String, Object> map);

}
