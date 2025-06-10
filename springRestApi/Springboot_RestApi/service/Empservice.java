package com.example.Springboot_RestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springboot_RestApi.entity.Emp;
import com.example.Springboot_RestApi.repository.Emprepo;
@Service
public class Empservice {
	
	@Autowired
	public Emprepo emprepo;
	
	public void addData(Emp emp)
	{
		emprepo.save(emp);
	}
	
	public List<Emp> getAllData()
	{
		return emprepo.findAll();
	}
	
	public void updateData(int id,Emp emp)
	{
		Optional<Emp> o=emprepo.findById(id);
		Emp e=o.get();
		e.setName(emp.getName());
		e.setSalary(emp.getSalary());
		emprepo.save(e);
	}
	
	public void delete(int id)
	{
		emprepo.deleteById(id);
	}

}
