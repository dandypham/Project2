package com.revature.repository;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Passenger;

@Repository("passengerRepository")
@Transactional
public class PassengerRepositoryHibernate implements PassengerRepository {

	private static Logger logger = Logger.getLogger(PassengerRepositoryHibernate.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public PassengerRepositoryHibernate() {
		logger.trace("Inject session factory bean");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Passenger> getAllPassengers() {
		return sessionFactory.getCurrentSession().createCriteria(Passenger.class).list();
	}

	@Override
	public void save(Passenger passenger) {
		sessionFactory.getCurrentSession().save(passenger);
	}

	@Override
	public Passenger getPassengerByName(String name) {
		try {
			return (Passenger) sessionFactory.getCurrentSession().createCriteria(Passenger.class)
				.add(Restrictions.like("name", name))
				.list()
				.get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

}
