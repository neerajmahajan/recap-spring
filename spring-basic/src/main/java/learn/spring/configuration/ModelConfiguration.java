package learn.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learn.spring.model.LoginModel;
import learn.spring.model.Model;

@Configuration
public class ModelConfiguration {
	@Bean
	public Model loginModel(){
		return new LoginModel();
	}

}
