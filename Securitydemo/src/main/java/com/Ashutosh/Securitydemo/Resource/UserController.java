package com.Ashutosh.Securitydemo.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ashutosh.Securitydemo.Service.MyUserDetailsService;
import com.Ashutosh.Securitydemo.model.User;

@RestController
public class UserController {

	@Autowired
	private MyUserDetailsService uds;
	
	@PostMapping(path="/UserRegister")
	public ResponseEntity<Object> saveUser(HttpServletRequest request){
		User user=new User();
		user.setCountry(request.getParameter("country"));
		user.setFirstname(request.getParameter("firstname"));
		user.setLastname(request.getParameter("lastname"));
		user.setId(request.getParameter("id"));
		user.setMobile(request.getParameter("contact"));
		user.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt()));
		user.setRole("ROLE_USER");
		String status=uds.saveUser(user);
		if(status.equals("success")) {
			return new ResponseEntity<>("Registration Successful",HttpStatus.OK);
		}
		return new ResponseEntity<>("UserName already exists",HttpStatus.RESET_CONTENT);
	}
	@PostMapping(path="/AdminRegister")
	public ResponseEntity<Object> saveAdmin(HttpServletRequest request){
		User user=new User();
		user.setCountry(request.getParameter("country"));
		user.setFirstname(request.getParameter("firstname"));
		user.setLastname(request.getParameter("lastname"));
		user.setId(request.getParameter("id"));
		user.setMobile(request.getParameter("contact"));
		user.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt()));
		user.setRole("ROLE_ADMIN");
		String status=uds.saveUser(user);
		if(status.equals("success")) {
			return new ResponseEntity<>("Registration Successful",HttpStatus.OK);
		}
		return new ResponseEntity<>("UserName already exists",HttpStatus.RESET_CONTENT);
	}
	
	@PostMapping(path="/CompanyRegister")
	public ResponseEntity<Object> saveACompany(HttpServletRequest request){
		User user=new User();
		user.setCountry(request.getParameter("country"));
		user.setFirstname(request.getParameter("firstname"));
		user.setLastname(request.getParameter("lastname"));
		user.setId(request.getParameter("id"));
		user.setMobile(request.getParameter("contact"));
		user.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt()));
		user.setRole("ROLE_COMPANY");
		String status=uds.saveUser(user);
		if(status.equals("success")) {
			return new ResponseEntity<>("Registration Successful",HttpStatus.OK);
		}
		return new ResponseEntity<>("UserName already exists",HttpStatus.RESET_CONTENT);
	}
	
	
}
