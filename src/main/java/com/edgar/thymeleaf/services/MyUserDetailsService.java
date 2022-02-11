package com.edgar.thymeleaf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.edgar.thymeleaf.models.UserPrincipal;
import com.edgar.thymeleaf.models.Ustable;
import com.edgar.thymeleaf.repositories.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Ustable user = userRepo.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}

		// TODO Auto-generated method stub
		return new UserPrincipal(user);
	}

}
