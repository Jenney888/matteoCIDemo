package com.puhui.xiaojin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PuhuixiaojinApplication {

	public static void main(String[] args) {
		System.out.println("args +\"\" = " + args +"项目初始化...");
		SpringApplication.run(PuhuixiaojinApplication.class, args);
	}

}
