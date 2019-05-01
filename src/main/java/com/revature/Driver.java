package com.revature;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.PassengerService;

public class Driver {
	private static Logger logger = Logger.getLogger(Driver.class);
	public static void main(String[] args) {
		//HeroService heroService = new HeroServiceImpl();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PassengerService passengerService = context.getBean("passengerService", PassengerService.class);
		//logger.trace((heroService.registerHero(new Hero(0, "Spiderman", "Spider-sense", false))) ? "Spiderman registered sucessfully":"Could not register Spiderman");
		//logger.trace((heroService.registerHero(new Hero(0, "Thor", "Lightning", true))) ? "Thor registered sucessfully":"Could not register Thor");
		//logger.trace((heroService.registerHero(new Hero(0, "Hulk", "Smash", false))) ? "Hulk registered sucessfully":"Could not register Hulk");
		//logger.trace((heroService.registerHero(new Hero(0, "Iron Man", "Rich", false))) ? "Iron Man registered sucessfully":"Could not register Iron Man");
		//logger.trace("Finding Hulk: " + heroService.getHero("Hulk"));
		//logger.trace("Finding Iron Man: " + heroService.getHero("Iron Man"));
		//logger.trace(heroService.getAllHeroes());
	}
}
