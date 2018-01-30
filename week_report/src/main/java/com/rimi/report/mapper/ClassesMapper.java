package com.rimi.report.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.rimi.report.entity.Classes;
@Mapper
public interface ClassesMapper {
	/**
	 * 删除班级
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 添加班级
	 * @param classes 传入一个封装好的班级
	 * @return 返回1添加成功
	 */
	
	public int add(Classes classes);
	/**
	 * 查询班级 
	 * @param ID
	 * @return 返回一个班级对象
	 */
	
	public Classes get(int id);
	
	/**
	 * 更新班级
	 * @param classes
	 * @return 返回1更新成功
	 */
	
	public int update(Classes classes);
	
	/**
	 * 查询班级列表
	 * @param map 查询条件列表key:条件名，value:条件值
	 * @return 返回包含对象的list
	 */
	
	public List<Classes> list(Map<String, Object> map);
	
	/**
	 * 查询总数
	 * @return 返回数字
	 */	
	public int total();

}
