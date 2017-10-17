package com.mvcpattern.service;

public class LoginService {

	

	public boolean Authenticate(String username, String password) {
		 if(username.equals("sandy")&& password.equals("sandy"))
			 return true;
		return false;
	}
}
