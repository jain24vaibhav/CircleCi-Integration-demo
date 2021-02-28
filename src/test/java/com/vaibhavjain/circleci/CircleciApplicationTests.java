package com.vaibhavjain.circleci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vaibhavjain.circleci.controller.HelloController;

@SpringBootTest
class CircleciApplicationTests {
	
	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		
		String response = helloController.hello();
		assertEquals(response, "Hello CircliCi");
		
	}

}
