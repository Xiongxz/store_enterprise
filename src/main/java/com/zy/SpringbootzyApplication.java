package com.zy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zy.mapper")
public class SpringbootzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootzyApplication.class, args);
	}
}
