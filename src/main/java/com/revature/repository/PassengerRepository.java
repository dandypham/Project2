package com.revature.repository;

import java.util.List;

import com.revature.model.Passenger;

public interface PassengerRepository {
	void save(Passenger passenger);
	List<Passenger> getAllPassengers();
	Passenger getPassengerByName(String name);
}
