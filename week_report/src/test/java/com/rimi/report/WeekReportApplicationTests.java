
package com.rimi.report;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rimi.report.entity.Classes;
import com.rimi.report.entity.Content;
import com.rimi.report.mapper.ContentMapper;
import com.rimi.report.mapper.HeadMapper;
import com.rimi.report.service.ClassesService;





@RunWith(SpringRunner.class)
@SpringBootTest
public class WeekReportApplicationTests {
	@Autowired
	ContentMapper cm;
	@Autowired
	HeadMapper headMapper;
	
	@Autowired
	ClassesService cs;
	@Test
	public void contextLoads() {
		
		}
		
	}


