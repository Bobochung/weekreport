package com.rimi.report.service;

import java.util.List;

import com.rimi.report.entity.Part;

public interface PartService {
	/**
	 * 添加部门
	 */
	void add(Part part);
	/**
	 * 删除部门
	 */
	void delete(Part part);
	/**
	 * 更新部门
	 */
	void update(Part part);
	
	/**
	 * 获得部门总数
	 */
	int total();
	
	/**
	 * 得到部门列表
	 */
	List<Part> list();
	
	/**
	 * 根据ID得到部门
	 * @return
	 */	
	Part getByID();

}
