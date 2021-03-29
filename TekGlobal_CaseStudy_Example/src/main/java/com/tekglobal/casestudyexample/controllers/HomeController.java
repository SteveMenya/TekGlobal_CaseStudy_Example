package com.tekglobal.casestudyexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tekglobal.casestudyexample.models.User;
import com.tekglobal.casestudyexample.services.UserService;

@Controller
public class HomeController {
	private UserService userService;
	
	@Autowired
	public HomeController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@GetMapping("/about")
	public String showAboutPage() {
		return "about";
	}
	@GetMapping("/contact")
	public String showContactPage() {
		return "contact"; 
	}
	@GetMapping("/saveHardCodedUser") 
		public String saveHardCodedUser() {
		User user = new User("testUser1", "testUser1@gmail.com", "1234");
		userService.saveUser(user);
		return "index";
	}
	
}
