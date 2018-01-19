package com.rimi.report.mapper;

import java.util.List;
import java.util.Map;

import com.rimi.report.entity.Part;

public interface PartMapper {
	/**
	 * 删除部门
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 添加部门
	 * @param part 传入一个封装好的部门
	 * @return 返回1添加成功
	 */
	
	public int add(Part part);
	/**
	 * 查询部门 
	 * @param ID
	 * @return 返回一个部门对象
	 */
	
	public Part get(int id);
	
	/**
	 * 更新部门
	 * @param 部门
	 * @return 返回1更新成功
	 */
	
	public int update(Part part);
	
	/**
	 * 查询部门列表
	 * @param map 查询条件列表key:条件名，value:条件值
	 * @return 返回包含对象的list
	 */
	
	public List<Part> list(Map<String, String> map);
	
	/**
	 * 查询总数
	 * @return 返回数字
	 */	
	public int total();
	
}
