package com.rimi.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HeadController {
	@RequestMapping("head")
	public String admin() {	
		return "head";
	}
}
