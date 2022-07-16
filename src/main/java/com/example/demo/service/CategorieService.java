package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categories;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategorieService implements ICategorieService{
	
	
	@Autowired(required=true)
	CategoryRepository categoryRepository;

	@Override
	public List<Categories> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Categories getCategorieById(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.getById(id);
	}

	@Override
	public void creatCategorie(Categories categorie) {
		// TODO Auto-generated method stub
	categoryRepository.save(categorie);
		
	}

	@Override
	public void deleteCategorieByid(int id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
		
	}

	@Override
	public void updateCategorie(int id, Categories categorie) {
		// TODO Auto-generated method stub
		
		Categories c=categoryRepository.getById(id);
		c.setId(categorie.getId());
		c.setImg_id(categorie.getImg_id());
		c.setName(categorie.getName());
		categoryRepository.save(c);
		
	}



}
