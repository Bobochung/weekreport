
package com.rimi.report;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rimi.report.entity.Head;
import com.rimi.report.mapper.HeadMapper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class WeekReportApplicationTests {
	
	
	@Autowired
	 HeadMapper headMapper;
	
	@Test
	public void contextLoads() {	
		Map<String,Object> params = new HashMap<>();
        params.put("name","张");
	for (Head head :headMapper.list(params) ) {
		System.err.println(head.toString()+"对应的部门"+head.getPart().getPart_name());
	}	

	}

}
