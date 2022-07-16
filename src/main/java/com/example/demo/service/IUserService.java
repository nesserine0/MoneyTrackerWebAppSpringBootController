package com.example.demo.service;

import com.example.demo.model.User;


public interface IUserService {
	
	
	
	User getUserById(int id);

	void updateUser(int id , User user);
	
	
}
