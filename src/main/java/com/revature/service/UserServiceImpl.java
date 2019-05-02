package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.repository.PassengerRepository;
import com.revature.repository.UserRepository;
@Service("userService")
public class UserServiceImpl implements UserService{
	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository userRepository;
	public UserServiceImpl() {} 
	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public UserServiceImpl(UserRepository userRepository) {
		logger.trace("Constructor injection");
		this.userRepository = userRepository;
	}
	@Override
	public boolean registerUser(User user) {
		userRepository.save(user);
		return user.getUser_id() != 0;
	}

	
	
	public UserRepository getUserRepository() {
		return userRepository;
	}
	
	
	
	@Override
	public User getUser(String user) {
		return userRepository.getUserByUsername(user);
	}

}
