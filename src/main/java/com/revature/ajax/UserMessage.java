package com.revature.ajax;

public class UserMessage {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	private UserMessage()
	{
		
	}
	public UserMessage(String message) {

		this.message = message;
	}
	
	
}
