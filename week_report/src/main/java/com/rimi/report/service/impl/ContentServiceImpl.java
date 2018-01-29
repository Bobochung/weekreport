package com.rimi.report.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rimi.report.entity.Content;
import com.rimi.report.mapper.ContentMapper;
import com.rimi.report.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	ContentMapper contentmapper;
	
	@Override
	public void add(Content content) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Content content) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Content content) {
		// TODO Auto-generated method stub

	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Content> list(HttpServletRequest request,Map<String, Object> map) {
		return contentmapper.list(map);
	}

	@Override
	public Content getByID() {
		// TODO Auto-generated method stub
		return null;
	}

}
