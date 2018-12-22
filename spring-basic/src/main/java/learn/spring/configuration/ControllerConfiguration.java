package learn.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class ControllerConfiguration {
	@Bean
	Controller loginConroller(Model loginModel, View loginView) {
		LoginController controller = new LoginController();
		controller.setModel(loginModel);
		controller.setView(loginView);
		return controller;
	}
}
