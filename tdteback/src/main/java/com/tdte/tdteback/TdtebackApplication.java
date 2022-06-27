package com.tdte.tdteback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class TdtebackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdtebackApplication.class, args);

		log.info("hahaha");
	}

}
