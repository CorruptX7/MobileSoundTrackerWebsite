package com.example.MobileTrackerWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.MobileTrackerWebsite")
@EnableAutoConfiguration
public class MobileTrackerWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileTrackerWebsiteApplication.class, args);
	}

}
