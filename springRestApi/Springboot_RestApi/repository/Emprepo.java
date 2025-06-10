package com.example.Springboot_RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springboot_RestApi.entity.Emp;
@Repository
public interface Emprepo extends JpaRepository<Emp, Integer>{

}
