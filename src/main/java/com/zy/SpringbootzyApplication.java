package com.zy;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zy.mapper")//使用tk提供的注解扫描，不然会报错
public class SpringbootzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootzyApplication.class, args);
	}
}
