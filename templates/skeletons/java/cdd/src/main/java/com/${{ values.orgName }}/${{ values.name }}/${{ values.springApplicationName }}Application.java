package com.${{ values.orgName }}.${{ values.name }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{ values.springApplicationName }}Application {

	public static void main(String[] args) {
		SpringApplication.run(${{ values.springApplicationName }}Application.class, args);
	}

}
