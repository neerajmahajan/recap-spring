package learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learn.spring.configuration.ControllerConfiguration;
import learn.spring.controller.Controller;
import learn.spring.entity.PremiumUser;
import learn.spring.entity.User;
import learn.spring.model.Model;

public class MainClassUsingJavaConfiguration {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ControllerConfiguration.class);
		
		Controller loginController = appContext.getBean("loginController", Controller.class);
		Model model = appContext.getBean("loginModel",Model.class);
		
		loginController.setModel(model);
		loginController.updateView();
		
		
		User user = new PremiumUser("Neeraj","XYZ");
		//System.out.println("User Validation " + loginController.validateUser(user));
	}
}
