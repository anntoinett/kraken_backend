package com.example.krakenwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.example.krakenwebsite.neo4j_mapping")
public class KrakenWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(KrakenWebsiteApplication.class, args);
	}

}
