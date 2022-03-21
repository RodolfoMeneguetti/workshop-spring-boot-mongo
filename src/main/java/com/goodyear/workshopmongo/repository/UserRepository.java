package com.goodyear.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.goodyear.workshopmongo.domain.User;

@Repository 				// Abrir TXT Estrutura passo a passo ... 
public interface UserRepository extends MongoRepository<User, String>{

}
