package com.garrett.SpringBootECommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garrett.SpringBootECommerce.model.User;

@RestController
public class UserController {
	
	@RequestMapping("/login/users")
	public String getUsers() {
		
		// User user = null;
		List<User> users = null;
		
		// 		If user is null, the user is not logged in and should be able to view users.
		//		if (user == null) {
		//			return "Not logged in.";
		//		}
		
		return (users != null) ? users.toString() : "No users found." ;
	}

}
