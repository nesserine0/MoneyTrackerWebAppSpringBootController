package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categories;
import com.example.demo.model.Expenses;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ExpensesRepository;

@Service
public class ExpensesService implements IExpensesService{
	
	
	@Autowired(required=true)
	ExpensesRepository expensesRepository;


	@Override
	public List<Expenses> getAllExpense() {
		// TODO Auto-generated method stub
		return expensesRepository.findAll();
	}

	@Override
	public Expenses getExpenseById(int id) {
		// TODO Auto-generated method stub
		return expensesRepository.getById(id);
	}

	@Override
	public void creatExpense(Expenses expense) {
		// TODO Auto-generated method stub
		expensesRepository.save(expense);
		
	}

	@Override
	public void deleteExpenseByid(int id) {
		// TODO Auto-generated method stub
		expensesRepository.deleteById(id);
	}

	@Override
	public void updateExpense(int id, Expenses expense) {
		// TODO Auto-generated method stub
		Expenses e=expensesRepository.getById(id);
		e.setId(expense.getId());
		e.setNote(expense.getNote());
	    e.setCategorie(expense.getCategorie());
	    e.setDate(expense.getDate());
	    e.setExp(expense.getExp());
	    e.setType(expense.getType());
		expensesRepository.save(e);
	}



}
