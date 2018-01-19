package com.rimi.report.service;

import java.util.List;

import com.rimi.report.entity.Classes;

public interface ClassesService {
	/**
	 * 添加班级
	 */
	void add(Classes classes);
	/**
	 * 删除班级
	 */
	void delete(Classes classes);
	/**
	 * 更新班级
	 */
	void update(Classes classes);
	
	/**
	 * 获得班级总数
	 */
	int total(Classes classes);
	/**
	 * 得到班级列表
	 * @return
	 */	
	List<Classes> list();
	
	/**
	 * 根据ID得到班级
	 * @return
	 */	
	Classes getByID();
	

}
