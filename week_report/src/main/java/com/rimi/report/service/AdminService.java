package com.rimi.report.service;

public interface AdminService {
	/**
	 * 添加管理员
	 */
	void add();
	/**
	 * 删除管理员
	 */
	void delete();
	/**
	 * 更新管理员
	 */
	void update();
	/**
	 * 管理员登录
	 */
	void login();
	/**
	 * 获得管理员总数
	 */
	int total();

}
