package com.vocabuddy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.vocabuddy.domain.repository")
@EnableAutoConfiguration
@ComponentScan("com.vocabuddy.*")
public class VocabApplication{

	public static void main(String[] args) {
		SpringApplication.run(VocabApplication.class, args);
	}
}
