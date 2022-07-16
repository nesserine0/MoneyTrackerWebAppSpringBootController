package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Images;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImgRepository  extends JpaRepository<Images, Integer>{
	
	List <Images> findAll();
	
	 Optional<Images> findById(int id);

}
