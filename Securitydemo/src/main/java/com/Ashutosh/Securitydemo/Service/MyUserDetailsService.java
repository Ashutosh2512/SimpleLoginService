package com.Ashutosh.Securitydemo.Service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Ashutosh.Securitydemo.UserPrincipal;
import com.Ashutosh.Securitydemo.model.User;
import com.Ashutosh.Securitydemo.repo.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> opt=ur.findById(username);
		if(!opt.isPresent()) {
			throw new UsernameNotFoundException("not found!!");
		}
		return new UserPrincipal(opt.get());
	}

	public String saveUser(User user) {
		String userName=user.getId();
		Optional<User> opt=ur.findById(userName);
		if(opt.isPresent()) {
			return "exists";
		}
		ur.save(user);
		return "success";
	}
}
