package com.rimi.report;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rimi.report.entity.Admin;
import com.rimi.report.service.AdminService;
import com.rimi.report.service.HeadService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WeekReportApplicationTests {
	
	
	@Autowired
	 AdminService adminService;
	
	@Test
	public void contextLoads() {
		
		System.out.println(adminService.getByID(2));
	}

}
