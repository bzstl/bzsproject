package com.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bzs.domain.CONTRACT;
import cn.bzs.service.CONTRACTService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-context.xml","classpath*:/spring-mvc.xml"})
public class BaseJunitTest {
	
	@Autowired
	private CONTRACTService cs; 
	
	@org.junit.Test
	public void Test(){
		CONTRACT ob = cs.find("0313f2b2-cb26-4138-ba1f-f070c933d19c");
		System.out.println(ob.getOfferor());
		
	}
}
