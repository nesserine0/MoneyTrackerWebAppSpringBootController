package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Categories;


import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository  extends JpaRepository<Categories, Integer>{
	
	List <Categories> findAll();
	
	 Optional<Categories> findById(int id);

}
