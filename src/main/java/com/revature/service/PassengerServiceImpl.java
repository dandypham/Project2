package com.revature.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Passenger;
import com.revature.repository.PassengerRepository;

@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {
	
	private static Logger logger = Logger.getLogger(PassengerServiceImpl.class);
	//Dependency
	@Autowired
	private PassengerRepository passengerRepository;
	//@Autowaired constructor injection
	public PassengerServiceImpl() {} 
	
	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepository.getAllPassengers();
	}
	public void setPassengerRepository(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	//@Autowired constructor injection
	public PassengerServiceImpl(PassengerRepository passengerRepository) {
		logger.trace("Constructor Injection");
		this.passengerRepository = passengerRepository;
	}
	
	//@Autowired setter injection
	public void setHibernate(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	@Override
	public boolean registerPassenger(Passenger passenger) {
		passengerRepository.save(passenger);
		return passenger.getId() != 0;
	}

	@Override
	public Passenger getPassenger(String name) {
		return passengerRepository.getPassengerByName(name);
	}
}
