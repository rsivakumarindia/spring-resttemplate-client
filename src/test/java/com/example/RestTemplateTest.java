package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.web.client.RestTemplate;

@RunWith(JUnit4.class)
public class RestTemplateTest {

	@Test
	public void test() {
		final RestTemplate restTemplate = new RestTemplate();
		final String response = restTemplate.getForObject("https://google.com", String.class);
		System.out.println(response);
	}
}
