package com.mailworld.weboa.ms.aa.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mailworld.weboa.ms.aa.AaApp;
import com.mailworld.weboa.ms.base.domain.Token;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AaApp.class)
public class AuthenticationServiceTest {
	
	@Autowired
	AuthenticationService authenticationService;

	@Test
	public void test() {
		
	    String username = "sulei";
	    String password = "123456";
		
		Token token = this.authenticationService.authenticate(username, password);
		
		assertNotNull(token);
		assertEquals("状态", 0, token.getStatus());
		System.out.println(token.getValue());
	}

}
