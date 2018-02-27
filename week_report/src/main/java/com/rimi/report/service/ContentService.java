package com.rimi.report.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rimi.report.entity.Content;

public interface ContentService {
	/**
	 * 添加内容
	 */
	void add(String content,String type,String date,int pid,int cid,int tid);
	/**
	 * 删除内容
	 */
	void delete(int cid);
	/**
	 * 更新内容
	 */
	void update(Content content);
	
	/**
	 * 获得内容总数
	 */
	int total();
	
	public void getReports(Map<String, Map<String, Object>> condition,HttpServletRequest request);
	/**
	 * 根据ID得到内容
	 * @return
	 */	
	Content getByID();


}
