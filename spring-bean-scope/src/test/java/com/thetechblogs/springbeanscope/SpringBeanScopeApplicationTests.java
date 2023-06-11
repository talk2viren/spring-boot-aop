package com.thetechblogs.springbeanscope;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootTest
@Slf4j
class SpringBeanScopeApplicationTests {


//	@Test
//	void contextLoads() {
//	}

	@Test
	private void restApiCall(){
		System.out.println("print");
//		RestTemplate restTemplate=new RestTemplate();
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<String> entity = new HttpEntity<String>(headers);
//		ResponseEntity<String> responseEntity= restTemplate.exchange("https://jsonplaceholder.typicode.com/todos/1", HttpMethod.GET, entity, String.class);
//		log.info("Test Calls "+responseEntity.toString());

	}

}
