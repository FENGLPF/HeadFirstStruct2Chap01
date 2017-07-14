package com.java1234.service;

import com.java1234.model.User;

public class UserService {

	public boolean login(User user){
		if(user.getUsername().equals("Struts2")&&user.getPassword().equals("123456")){
			return true;
		}else{
			return false;
		}
	}
}
