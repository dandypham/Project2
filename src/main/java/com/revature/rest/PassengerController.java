package com.revature.rest;

import java.util.List;

import com.revature.ajax.UserMessage;
import com.revature.model.Passenger;



public interface PassengerController {
	UserMessage registerPassenger(Passenger passenger);
	Passenger findPassengerHomeworld(Passenger passenger);
	List<Passenger> getAllPassengers();
	Passenger findPassenger(Passenger passenger);

}
