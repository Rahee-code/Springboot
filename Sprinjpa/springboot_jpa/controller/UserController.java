package com.example.springboot_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springboot_jpa.entity.User;
import com.example.springboot_jpa.service.UserService;

@Controller
public class UserController {
	@Autowired
	public UserService userService;
	
	@RequestMapping("/register")
	public String register()
	{
		User user=new User("rohit@gmail.com","rohit");
		userService.addUser(user);
		return "register";
	}
	
	@RequestMapping("/findAllUser")
	@ResponseBody
	public List<User> getAllUser()
	{
		return userService.findAllUser();
	}
	
	@RequestMapping("/findUserById/{id}")
	@ResponseBody
	public User getUserById(@PathVariable("id") int id)
	{
		return userService.findUserById(id);
	}
	
	@RequestMapping("/updateUser/{id}")
		@ResponseBody
		public String updateuser(@PathVariable("id") int id)
		{
			User u=new User();
			u.setName("khatu");
			userService.updateUser(id, u);
			return "update successful";
		}
	
	@RequestMapping("/findUserByName/{name}")
	@ResponseBody
	public User getUser(@PathVariable("name") String name)
	{
		return userService.getUserByName(name);
	}
	
}
