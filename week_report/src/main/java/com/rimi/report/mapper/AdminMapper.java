package com.rimi.report.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.rimi.report.entity.Admin;

@Mapper
public interface AdminMapper {
	
	/**
	 * 删除管理员
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 添加管理员
	 * @param admin 传入一个封装好的管理员
	 * @return 返回1添加成功
	 */
	
	public int add(Admin admin);
	/**
	 * 查询管理员 
	 * @param ID
	 * @return 返回一个管理员对象
	 */
	
	public Admin get(int id);
	
	/**
	 * 更新管理员
	 * @param admin
	 * @return 返回1更新成功
	 */
	
	public int update(Admin admin);
	
	/**
	 * 查询管理员列表
	 * @param map 查询条件列表key:条件名，value:条件值
	 * @return 返回包含对象的list
	 */
	
	public List<Admin> list();
	
	/**
	 * 查询总数
	 * @return 返回数字
	 */	
	public int total();
	
	/**
	 * 根据用户名和密码查询用户
	 * @param name
	 * @param password
	 * @return
	 */
	public Admin getByNameandPwd(@Param("admin_name")String admin_name,@Param("admin_password")String admin_password);
	/**
	 * 根据用户名查询用户唯一性。
	 * @param name
	 * @return 返回admin不为空，则该用户已经注册
	 */
	public Admin getByName(String name);

}
