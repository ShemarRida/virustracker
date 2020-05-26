package com.corona.virustracker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VirusTracker2Application {

	public static void main(String[] args) {
		SpringApplication.run(VirusTracker2Application.class, args);
	}

}
