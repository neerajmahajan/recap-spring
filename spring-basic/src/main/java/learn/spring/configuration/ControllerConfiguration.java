package learn.spring.configuration;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import learn.spring.controller.Controller;
import learn.spring.controller.LoginController;
import learn.spring.model.Model;
import learn.spring.view.View;

/**
 * Controller Configuration
 *
 */
@Configuration
@Import({ ModelConfiguration.class, ViewConfiguration.class })
@ComponentScan(basePackages={"learn.spring"})
@EnableAspectJAutoProxy
public class ControllerConfiguration {
	
	@Autowired // This autowires by Type first
	private Model loginModel;
	
	@Autowired @Qualifier("lloginModel")
	private Model otherLoginModel;
	
	@Resource // This autowires by propertyName first // Standard Annotation
	private Model logModel;
	
	@Bean
	public Controller loginController(View loginView) {
		Controller controller = new LoginController();
		controller.setModel(loginModel);
		controller.setView(loginView);
		System.out.println(otherLoginModel.getModelName());
		System.out.println(logModel.getModelName());
		return controller;
	}
}
