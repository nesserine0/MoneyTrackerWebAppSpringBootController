package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;
import com.example.demo.model.Expenses;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExpensesRepository  extends JpaRepository<Expenses, Integer>{
	
	List <Expenses> findAll();
	
	 Optional<Expenses> findById(int id);

}
