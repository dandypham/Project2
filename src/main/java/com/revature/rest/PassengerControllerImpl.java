package com.revature.rest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import static com.revature.util.UserMessageUtil.REGISTRATION_SUCCESSFUL;
import static com.revature.util.UserMessageUtil.SOMETHING_WENT_WRONG;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.ajax.UserMessage;
import com.revature.model.Passenger;
import com.revature.service.PassengerService;

import org.springframework.stereotype.Controller;

@Controller("passengerController")
@CrossOrigin(origins = "http://localhost:4200")
public class PassengerControllerImpl implements PassengerController{
	
	private static Logger logger = Logger.getLogger(PassengerControllerImpl.class);
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/getAllPassengers")
	public @ResponseBody List<Passenger> getAllPassengers() {
		logger.trace("Getting list of all passengers");
		return passengerService.getAllPassengers();
	}

	@PostMapping("/findPassenger")
	public @ResponseBody Passenger findPassenger(Passenger passenger) {
		logger.trace("Find passenger match name" + passenger.getName());
		return passengerService.getPassenger(passenger.getName());
	}
	@PostMapping("/findPassengerHomeworld")
	public @ResponseBody Passenger findPassengerHomeworld(Passenger passenger) {
		logger.trace("Find passenger homeworld from name" + passenger.getName());
		return passengerService.getPassenger(passenger.getHomeworld());
	}
	//i dont think we need to register new passenger
	@PostMapping("/registerPassenger")
	public @ResponseBody UserMessage registerPassenger(@RequestBody Passenger passenger) {
		//write user controller for this
		logger.trace("Registering new passenger" +passenger);
		return (passengerService.registerPassenger(passenger)) ? REGISTRATION_SUCCESSFUL : SOMETHING_WENT_WRONG;
	}

	

}
