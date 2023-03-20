package com.plukash.jwtauthbase;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthBaseApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(JwtAuthBaseApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
