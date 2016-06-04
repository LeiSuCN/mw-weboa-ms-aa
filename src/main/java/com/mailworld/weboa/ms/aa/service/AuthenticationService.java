package com.mailworld.weboa.ms.aa.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mailworld.weboa.ms.base.domain.Token;
import com.mailworld.weboa.ms.base.fn.JWTBuilder;

@Service
public class AuthenticationService {
	
	@Autowired
	private JWTBuilder jwtBuilder;
	
	public Token authenticate(String username, String password){
		
		Map<String, Object> claims = new HashMap<>();
		claims.put("name", username);
		String jwt = this.jwtBuilder.apply(claims);
		
		Token token = new Token();
		token.setValue(jwt);

		return token;
	}

}
