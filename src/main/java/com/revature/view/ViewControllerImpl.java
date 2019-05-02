package com.revature.view;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("viewController")
public class ViewControllerImpl implements ViewController {

	private static Logger logger = Logger.getLogger(ViewControllerImpl.class);
	@RequestMapping(value= {"/","/index"}, method=RequestMethod.GET)
	public String index() {
		logger.trace("Return indexn. html to the user");
		return "index";
	}

}