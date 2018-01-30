package com.rimi.report.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Part;


public interface PartService {
	/**
	 * 添加部门
	 */
	void add(Part part);
	/**
	 * 删除部门
	 */
	void delete(int id);
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
	List<Part> list(HttpServletRequest request,Map<String, Object> map);
	
	/**
	 * 根据ID得到部门
	 * @return
	 */	
	Part getByID(int id);

}
