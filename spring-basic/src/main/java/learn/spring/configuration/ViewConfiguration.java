package learn.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.spring.view.LoginView;
import learn.spring.view.View;

@Configuration
public class ViewConfiguration {
	
	@Bean
	public View loginView(){
		return new LoginView();
	}

}
