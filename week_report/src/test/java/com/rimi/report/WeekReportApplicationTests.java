
package com.rimi.report;



import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rimi.report.entity.Content;
import com.rimi.report.entity.Head;
import com.rimi.report.mapper.AdminMapper;
import com.rimi.report.mapper.ContentMapper;
import com.rimi.report.mapper.HeadMapper;
import com.rimi.report.service.AdminService;
import com.rimi.report.service.impl.AdminServiceImpl;




@RunWith(SpringRunner.class)
@SpringBootTest
public class WeekReportApplicationTests {
	@Autowired
	ContentMapper cm;
	@Autowired
	HeadMapper headMapper;
	
	@Test
	public void contextLoads() {	
		System.out.println(cm.total());
		Map<String, Object> map = new HashMap<>();
		//map.put("type", "");
		//map.put("name", "张");
		map.put("id", 2);
		System.out.println("******head*****");
		//for(Head head :headMapper.list(map)) {
		//	System.out.println(head.toString());
		//}
		for(Content content : cm.list(map)) {
			System.out.println(content.toString());
		}
		System.out.println("******footer*****");
		
		
	}

}
