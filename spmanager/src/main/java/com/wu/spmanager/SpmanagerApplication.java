package com.wu.spmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("com.wu.spmanager.dao")
public class SpmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpmanagerApplication.class, args);
	}
}
