package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Categories;


public interface ICategorieService {
	
	
   List<Categories> getAllCategories();
	
	Categories getCategorieById(int id);
	
      void creatCategorie(Categories categorie);
	
	
	void deleteCategorieByid(int id);
	
	void updateCategorie(int id , Categories categorie);

}
