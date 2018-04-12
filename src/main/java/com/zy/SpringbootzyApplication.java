package com.zy;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring-boot启动入口
 * 所有类必须在同级目录或下级目录
 */
@SpringBootApplication
@MapperScan("com.zy.mapper")//使用tk提供的注解扫描，不然会报错
public class SpringbootzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootzyApplication.class, args);
	}
}
