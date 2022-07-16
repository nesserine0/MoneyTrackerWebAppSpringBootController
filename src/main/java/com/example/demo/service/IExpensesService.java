package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Expenses;


public interface IExpensesService {
	
	
   List<Expenses> getAllExpense();
	
	Expenses getExpenseById(int id);
	
      void creatExpense(Expenses expense);
	
	
	void deleteExpenseByid(int id);
	
	void updateExpense(int id , Expenses expense);

}
