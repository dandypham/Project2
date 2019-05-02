package com.revature.service;

import java.util.List;

import com.revature.model.User;

public interface UserService {
	public boolean registerUser(User user);
	List<User> getAllUsers();
	User getUser(String username);

}
