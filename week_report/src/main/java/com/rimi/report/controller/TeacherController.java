package com.rimi.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TeacherController {
	@RequestMapping("teacher")
	public String admin() {	
		return "teacher";
	}
}
