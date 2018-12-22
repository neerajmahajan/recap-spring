package learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learn.spring.controller.LoginController;
import learn.spring.entity.PremiumUser;
import learn.spring.entity.User;

public class MainClassUsingXmlConfig {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-beans.xml");

		LoginController loginController = appContext.getBean("loginController", LoginController.class);

		User user = new PremiumUser("Neeraj", "XYZ");
		System.out.println("User Validation " + loginController.validateUser(user));
	}

}
