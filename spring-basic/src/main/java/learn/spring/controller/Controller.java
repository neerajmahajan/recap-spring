package learn.spring.controller;

import learn.spring.model.Model;
import learn.spring.view.View;

public interface Controller {
	
	void setModel(Model model);
	void setView(View view);
	void updateView();
	

}
