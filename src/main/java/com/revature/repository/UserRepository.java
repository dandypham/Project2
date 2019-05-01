package com.revature.repository;

import java.util.List;

import com.revature.model.User;

public interface UserRepository {

	List<User> getAllUsers();
	User getUserByUsername(String username);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	void save(User user);
}
