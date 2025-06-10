package com.example.springboot_jpa.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_jpa.entity.User;
import com.example.springboot_jpa.repo.UserRepo;
@Service
public class UserService {
	
	@Autowired
	public UserRepo userRepo;
	
	public void addUser(User user)
	{
		userRepo.save(user);
	}
	
	public List<User> findAllUser(){
		return userRepo.getAllUser();
	}
	
	public User findUserById(int id){
		Optional<User> u= userRepo.findById(id);
		return u.get();
	}
	
	public void updateUser(int id,User user)
	{
		Optional<User> o= userRepo.findById(id);
		User u=o.get();
		u.setName(user.getName());
		userRepo.save(u);
	}
	
	public void deleteUserById(int id)
	{
		userRepo.deleteById(id);
	}
	
	public User getUserByName(String name)
	{
		return userRepo.findByName(name);
	}

}
