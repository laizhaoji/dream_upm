package com.dream.upm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dream.upm.Role.mapper")
@SpringBootApplication
public class UpmApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpmApplication.class, args);
	}

}
