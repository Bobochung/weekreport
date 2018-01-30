package com.rimi.report.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Classes;

public interface ClassesService {
	/**
	 * 添加班级
	 */
	void add(Classes classes);
	/**
	 * 删除班级
	 */
	void delete(int  id);
	/**
	 * 更新班级
	 */
	void update(Classes classes);
	
	/**
	 * 获得班级总数
	 */
	int total();
	/**
	 * 得到班级列表
	 * @return
	 */	
	List<Classes> list(HttpServletRequest request,Map<String, Object> map);
	
	/**
	 * 根据ID得到班级
	 * @return
	 */	
	Classes getByID(int id);
	
	
}
