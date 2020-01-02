package com.Ashutosh.Securitydemo.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping(path="/home")
	public String home() {
		return "home.jsp";
	}
	@GetMapping(path="/login")
	public String login() {
		return "login.jsp";
	}
	@GetMapping(path="/logout-success")
	public String logout() {
		return "logout.jsp";
	}
	@GetMapping(path="/Questions")
	@ResponseBody
	public String getAllQuestions() {
		return "Here Are ur Questions";
	}
	@GetMapping(path="/user_registration_link")
	public String userregistrationLink() {
		return "register.jsp";
	}
	@GetMapping(path="/admin_registration_link")
	public String adminregistrationlink() {
		return "adminregister.jsp";
	}
	@GetMapping(path="/company_registration_link")
	public String comppanyregistrationlink() {
		return "comapnyregister.jsp";
	}
}
