package com.rimi.report.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.rimi.report.entity.Head;

@Mapper
public interface HeadMapper {
	/**
	 * 删除主管
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 添加主管
	 * @param head 传入一个封装好的主管
	 * @return 返回1添加成功
	 */
	
	public int add(Head head);
	/**
	 * 查询主管 
	 * @param ID
	 * @return 返回一个主管对象
	 */
	
	public Head get(int id);
	
	/**
	 * 更新主管
	 * @param head
	 * @return 返回1更新成功
	 */
	
	public int update(Head head);
	
	/**
	 * 查询主管列表
	 * @param map 查询条件列表key:条件名，value:条件值
	 * @return 返回包含对象的list
	 */
	
	public List<Head> list(Map<String, String> map);
	
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
	public Head getByNameandPwd(String name,String password);

}
