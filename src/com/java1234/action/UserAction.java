package com.java1234.action;

import com.java1234.model.User;
import com.java1234.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private UserService userService = new UserService();
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("执行了UserAction默认方法");
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		if(userService.login(user)){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

}
