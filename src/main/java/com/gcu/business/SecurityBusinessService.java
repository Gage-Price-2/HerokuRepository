package com.gcu.business;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {
	public boolean authenticate(String username, String password) {
		System.out.println("\nHello from the SecurityBusinessService\n");
		return true;
	}
	

}
