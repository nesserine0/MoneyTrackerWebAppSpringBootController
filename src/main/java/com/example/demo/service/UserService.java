package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

import com.example.demo.repository.UserRepository;

@Service
public class UserService implements IUserService{
	
	
	@Autowired(required=true)
	UserRepository userRepository;


	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}

	@Override
	public void updateUser(int id, User user) {
		// TODO Auto-generated method stub
		
		User u=userRepository.getById(id);
		u.setId(user.getId());
		u.setName(user.getName());
		u.setBalance(user.getBalance());
		userRepository.save(u);
		
	}

}
