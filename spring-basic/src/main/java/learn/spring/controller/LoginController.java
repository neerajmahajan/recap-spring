package learn.spring.controller;


import java.util.logging.Logger;

import learn.spring.entity.User;

public class LoginController extends AbstractController {
	
	Logger logger = Logger.getLogger(getClass().getName());

	@Override
	public void updateView() {
		
		logger.info("&&&& Update View is called &&&&");

	}

	public boolean validateUser(User user) {
		
		System.out.println("Model connected is  " + getModel().getModelName());

		String userName = user.getUserName();
		String password = user.getPassword();

		if (userName.startsWith("M")) {
			return true;
		} else {
			return false;
		}

	}

}
