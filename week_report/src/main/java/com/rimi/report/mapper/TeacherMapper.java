package com.rimi.report.mapper;

import java.util.List;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.rimi.report.entity.Teacher;

@Mapper
public interface TeacherMapper {
	/**
	 * 删除教师
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 添加教师
	 * @param teacher 传入一个封装好的教师
	 * @return 返回1添加成功
	 */
	
	public int add(Teacher teacher);
	/**
	 * 查询教师 
	 * @param ID
	 * @return 返回一个教师对象
	 */
	
	public  Teacher get(int id);
	
	/**
	 * 更新教师
	 * @param teacher
	 * @return 返回1更新成功
	 */
	
	public int update(Teacher teacher);
	
	/**
	 * 查询教师列表
	 * @param map 查询条件列表key:条件名，value:条件值
	 * @return 返回包含对象的list
	 */
	
	public List<Teacher> list(Map<String, String> map);
	
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
	public Teacher getByNameandPwd(String name,String password);

}
