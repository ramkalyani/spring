package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.User;
import com.zensar.services.UserService;

@Controller
//request proccessor component
public class LoginController {
	@Autowired
	private UserService userService;
	@GetMapping("Login")
	public String checkLogin(User user , ModelMap map)
	{
		if(userService.validateUser(user))
		{
			map.addAttribute("username", user.getUserName());
			return "welcome";
		}
		else
		{
			map.addAttribute("logonerror", "invalid user name or password");
			return "login";  
		}
	}
	
	
	

}
