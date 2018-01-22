
package com.rimi.report;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rimi.report.entity.Admin;
import com.rimi.report.mapper.AdminMapper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class WeekReportApplicationTests {
	
	
	@Autowired
	 AdminMapper adminMapper;
	
	@Test
	public void contextLoads() {		
	for (Admin admin :adminMapper.list() ) {
		System.err.println(admin.toString());
	}	
		
		
		
		adminMapper.list();
	}

}
