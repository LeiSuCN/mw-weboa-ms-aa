package com.mailworld.weboa.ms.aa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mailworld.weboa.ms.base.fn.JWTBuilder;

@Configuration
public class AaConfigration {
	
	@Value("${secret.key}")
	private String secretKey;
	
	@Bean
	public JWTBuilder getJWTBuilder(){
		return new JWTBuilder(this.secretKey);
	}

}
