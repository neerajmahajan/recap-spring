package learn.spring.controller;

import learn.spring.entity.User;

public class LoginController extends AbstractController {

	@Override
	public void updateView() {

	}

	public boolean validateUser(User user) {

		String userName = user.getUserName();
		String password = user.getPassword();

		if (userName.startsWith("M")) {
			return true;
		} else {
			return false;
		}

	}

}
