package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Images;


public interface IimageService {
	
	
   List<Images> getAllImages();
	
	Images getImageById(int id);

}
