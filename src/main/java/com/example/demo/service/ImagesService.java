package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Images;
import com.example.demo.repository.ImgRepository;

@Service
public class ImagesService implements IimageService{
	
	
	@Autowired(required=true)
	ImgRepository imgRepository;

	@Override
	public List<Images> getAllImages() {
		// TODO Auto-generated method stub
		return imgRepository.findAll();
	}

	@Override
	public Images getImageById(int id) {
		// TODO Auto-generated method stub
		return imgRepository.getOne(id);
	}

}
