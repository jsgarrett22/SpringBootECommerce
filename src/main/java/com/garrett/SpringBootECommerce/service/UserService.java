package com.garrett.SpringBootECommerce.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.garrett.SpringBootECommerce.model.User;

@Service
public class UserService {
	
	List<User> users = Arrays.asList(
			new User("01", "admin@gmail.com", "admin", "password1234"),
			new User("02", "intern@gmail.com", "intern", "password")
			);
	
	public List<User> getUsers() {
		return users;
	}
	
}
