package com.revature.rest;
import java.util.List;
import com.revature.ajax.UserMessage;

import com.revature.model.User;

public interface UserController {
	UserMessage registerUser(User user);
	List<User> getAllUsers();
	User findUser(User user);
}
