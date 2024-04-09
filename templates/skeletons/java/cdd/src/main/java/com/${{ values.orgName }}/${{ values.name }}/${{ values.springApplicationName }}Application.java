package com.${{ values.orgName }}.${{ values.name }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class ${{ values.springApplicationName }}Application {

	public static void main(String[] args) {
		SpringApplication.run(${{ values.springApplicationName }}Application.class, args);
	}

}
