package appdocker.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("loginController")
@RequestScoped
public class LoginController {
	private String msg;

	@PostConstruct
	public void init() {
		System.out.println("INIT CALLED");
		setMsg("Start");
	}

	public String submit() {
		setMsg(msg + ":Z");
		return "";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
