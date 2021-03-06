package com.rimi.report.mapper;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.rimi.report.entity.Content;
@Mapper
public interface ContentMapper {
	
	/**
	 * 删除内容
	 * @param id
	 */
	public void delete(int cid);
	
	/**
	 * 添加内容
	 * @param content 传入一个封装好的内容
	 * @return 返回1添加成功
	 */
	
	public int add(@Param("content")String content,@Param("type")String type,@Param("date")String date,@Param("part_id")int part_id,@Param("classes_id")int classes_id,@Param("teacher_id")int teacher_id);
	/**
	 * 查询内容
	 * @param ID
	 * @return 返回一个内容对象
	 */
	
	//public Content get(int id);
	
	/**
	 * 更新内容
	 * @param content
	 * @return 返回1更新成功
	 */
	
	//public int update(Content content);
	
	/**
	 * 查询内容列表
	 * @param map 查询条件列表key:条件名，value:条件值
	 * @return 返回包含对象的list
	 */
	
	public List<Content> list(Map<String, Object> map);
	
	/**
	 * 查询总数
	 * @return 返回数字
	 */	
	public int total();

}
