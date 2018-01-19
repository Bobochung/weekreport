package com.rimi.report.service;

import java.util.List;

import com.rimi.report.entity.Content;

public interface ContentService {
	/**
	 * 添加内容
	 */
	void add(Content content);
	/**
	 * 删除内容
	 */
	void delete(Content content);
	/**
	 * 更新内容
	 */
	void update(Content content);
	
	/**
	 * 获得内容总数
	 */
	int total();
	
	/**
	 * 得到内容列表
	 */
	List<Content> list();
	/**
	 * 根据ID得到内容
	 * @return
	 */	
	Content getByID();


}
