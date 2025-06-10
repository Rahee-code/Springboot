package com.example.Springboot_RestApi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;
	private int did;
	private String dname;
//	@OneToMany(mappedBy = "department")
//	@JsonBackReference
//	private List<Emp> emp;
//	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
//	public List<Emp> getEmp() {
//		return emp;
//	}
//	public void setEmp(List<Emp> emp) {
//		this.emp = emp;
//	}
	public Department( int did, String dname) {
		super();
		
		this.did = did;
		this.dname = dname;
//		this.emp = emp;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
