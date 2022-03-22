package com.goodyear.workshopmongo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodyear.workshopmongo.ServiceException.ObjectNotFoundException;
import com.goodyear.workshopmongo.domain.User;
import com.goodyear.workshopmongo.dto.UserDTO;
import com.goodyear.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User (objDTO.getId(),objDTO.getName(),objDTO.getEmail());
	}
}