package com.gcu.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {
	public boolean authenticate(String username, String password) {
		//System.out.println("\nHello from the SecurityBusinessService\n");
		Logger log = LoggerFactory.getLogger(SecurityBusinessService.class);
		System.out.println(log.atInfo());
		return true;
	}
	

}
