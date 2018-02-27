package com.rimi.report.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PRIVATE_MEMBER;
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
	public void add(String content,String type,String date,int pid,int cid,int tid) {
		contentmapper.add(content,type,date,pid,cid,tid);
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		contentmapper.delete(cid);

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
	public void getReports(Map<String, Map<String, Object>> condition,HttpServletRequest request) {
		
		
		for(Map.Entry<String, Map<String, Object>> item : condition.entrySet()) {
			
			setReportToSession(request,item.getKey(),item.getValue());
		}
	}
	
	private void setReportToSession(HttpServletRequest request,String key,Map<String, Object> value) {
		request.getSession().setAttribute(key, getReport(request, value));
	}
	
	
	private List<Content> getReport(HttpServletRequest request,Map<String, Object> map) {
		return contentmapper.list(map);
	}

	@Override
	public Content getByID() {
		// TODO Auto-generated method stub
		return null;
	}

}
