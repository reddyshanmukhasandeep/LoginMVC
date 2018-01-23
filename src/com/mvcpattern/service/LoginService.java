package com.mvcpattern.service;

import java.util.HashMap;

import com.mvcpattern.dto.User;

public class LoginService {

	HashMap<String,String> users = new HashMap<String,String>();
	public LoginService(){
		users.put("sandy", "sandeep");
		users.put("shan","shanmuk");
	}

	public boolean Authenticate(String username, String password) {
		 if(username.equals("sandy")&& password.equals("sandy"))
			 return true;
		return false;
	}
	
	public User getUsername(){
		return null;
		
		
	} 
}
