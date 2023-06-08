package com.empresa.proyecto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.empresa.proyecto.documents.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
