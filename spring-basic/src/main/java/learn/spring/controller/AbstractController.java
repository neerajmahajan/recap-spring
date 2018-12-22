package learn.spring.controller;

import learn.spring.model.Model;
import learn.spring.view.View;

public abstract class AbstractController implements Controller {

	private Model model;
	private View view;

	@Override
	public void setModel(Model model) {
		this.model = model;

	}

	@Override
	public void setView(View view) {
		this.view = view;

	}

	protected Model getModel() {
		return model;
	}

	protected View getView() {
		return view;
	}
}
