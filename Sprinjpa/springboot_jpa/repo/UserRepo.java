package com.example.springboot_jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot_jpa.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	public User findByName(String name);
	
//	@Query("select u from User u")
	@Query(value = "select*from user",nativeQuery = true)
	public List<User> getAllUser();
}
