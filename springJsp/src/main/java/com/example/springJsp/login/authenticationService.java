package com.example.springJsp.login;

import org.springframework.stereotype.Service;

@Service
public class authenticationService {
	public boolean Authenticate(String Username,String password)
	{
		boolean isValidusername=Username.equalsIgnoreCase("Srikanth");
		boolean isValidPassword=password.equalsIgnoreCase("Vishnu");
		return ((isValidusername)&&(isValidPassword));
	}

}
