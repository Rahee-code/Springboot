package com.example.Springboot_RestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springboot_RestApi.entity.Emp;
import com.example.Springboot_RestApi.service.Empservice;

@RestController
@RequestMapping("/user")
public class Empcontroller {
	
	@Autowired
	public Empservice empservice;

	@PostMapping("/add")
	public String addData(@RequestBody Emp emp)
	{
		empservice.addData(emp);
		return "data added";
	}
	
	@GetMapping("/get")
	public List<Emp> getData()
	{
		
		return empservice.getAllData();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") int id,@RequestBody Emp emp)
	{
		empservice.updateData(id, emp);
		return "data updated";
	}
	
	@PutMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		empservice.delete(id);
		return "data deleted";
	}
}
