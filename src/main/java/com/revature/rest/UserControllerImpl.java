package com.revature.rest;

import static com.revature.util.UserMessageUtil.REGISTRATION_SUCCESSFUL;
import static com.revature.util.UserMessageUtil.SOMETHING_WENT_WRONG;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.ajax.UserMessage;
import com.revature.model.Passenger;
import com.revature.model.User;
import com.revature.service.PassengerService;
import com.revature.service.UserService;

@Controller("userController")
@CrossOrigin(origins = "http://localhost:4200")
public class UserControllerImpl implements UserController {
	private static Logger logger = Logger.getLogger(UserControllerImpl.class);
	@Autowired
	private UserService userService;
	@Override
	@PostMapping("/registerUser")
	public UserMessage registerUser(User user) {
		logger.trace("Registering new passenger" +user);
		return (userService.registerUser(user)) ? REGISTRATION_SUCCESSFUL : SOMETHING_WENT_WRONG;
	}

	@GetMapping("/getAllUsers")
	public @ResponseBody List<User> getAllUsers() {
		logger.trace("Getting list of all users");
		return userService.getAllUsers();
	}

	@PostMapping("/findUser")
	public @ResponseBody User findUser(User user) {
		logger.trace("Find user by username" + user.getUsername());
		return userService.getUser(user.getUsername());
	}

}
