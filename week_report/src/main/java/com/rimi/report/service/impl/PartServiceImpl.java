package com.rimi.report.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Part;
import com.rimi.report.mapper.PartMapper;
import com.rimi.report.service.PartService;
import com.rimi.report.util.Keys;

@Service
public class PartServiceImpl implements PartService {
	
	@Autowired
	PartMapper partMapper;

	@Override
	public void add(Part part) {
		partMapper.add(part);

	}

	@Override
	public void delete(int id) {
		partMapper.delete(id);

	}

	@Override
	public void update(Part part) {
		partMapper.update(part);

	}

	@Override
	public int total() {
		
		return partMapper.total();
	}

	@Override
	public List<Part> list(HttpServletRequest request,Map<String, Object> map) {
		request.getSession().setAttribute(Keys.PART_LIST,partMapper.list(map));	
		return partMapper.list(map);
	}

	@Override
	public Part getByID(int id) {
		return partMapper.get(id);
	}

}
