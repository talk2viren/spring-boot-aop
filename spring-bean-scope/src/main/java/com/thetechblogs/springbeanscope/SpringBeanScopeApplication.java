package com.thetechblogs.springbeanscope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
@EnableAspectJAutoProxy
@Slf4j
public class SpringBeanScopeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanScopeApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {
		System.out.println("inside run");
		RestTemplate restTemplate=new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> responseEntity= restTemplate.exchange("https://jsonplaceholder.typicode.com/todos/1", HttpMethod.GET, entity, String.class);
		log.info("Test Calls "+responseEntity.toString());
	}
}
