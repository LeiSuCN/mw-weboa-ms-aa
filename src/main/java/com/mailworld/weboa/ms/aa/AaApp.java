package com.mailworld.weboa.ms.aa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AaApp {
	  public static void main(String[] args) {
		  SpringApplication application = new SpringApplication(AaApp.class);
		  application.run(args);
	  }
}
