package com.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication  // 스프링 부트 애플리케이션 설정
public class Map1Application {

	public static void main(String[] args) {
		try {
			SpringApplication.run(Map1Application.class, args); // 예시, Spring Boot인 경우
		} catch (Exception e) {
			e.printStackTrace(); // 예외를 출력하여 원인 파악
		}
	}
}
