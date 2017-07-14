package com.java1234.action;

import com.java1234.model.User;
import com.java1234.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction2 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	private UserService userService = new UserService();
	

	@Override
	public String execute() throws Exception {
		System.out.println("执行了UserAction默认方法");
		
		if(userService.login(user)){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
