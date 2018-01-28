package com.rimi.report.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimi.report.service.HeadService;
import com.rimi.report.util.Keys;
@Controller
public class HeadController {
	
	@Autowired
	HeadService hs;
	@RequestMapping("head")
	public String headlist(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		request.getSession().setAttribute(Keys.HEAD_LIST, hs.list(map));
		return "head";
	}
}
