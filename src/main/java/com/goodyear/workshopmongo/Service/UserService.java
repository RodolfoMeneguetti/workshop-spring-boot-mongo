package com.goodyear.workshopmongo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodyear.workshopmongo.domain.User;
import com.goodyear.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo; 
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
