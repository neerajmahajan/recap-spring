package learn.spring.controller;

import learn.spring.entity.User;

public class LoginController extends AbstractController {

	@Override
	public void updateView() {

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
