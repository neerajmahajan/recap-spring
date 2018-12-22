package learn.spring.model;

import org.springframework.stereotype.Component;

//@Component
// This annotation can be used if componentScan is used for autowiring.

public class LoginModel implements Model{
	
	private String modelName;
	
	public LoginModel(String modelName) {
		this.modelName = modelName;
	}
	public LoginModel() {
		modelName = "Default";
	}	
	public String getModelName(){
		return modelName;
	}

}
