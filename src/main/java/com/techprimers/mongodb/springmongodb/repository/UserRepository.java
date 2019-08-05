package com.techprimers.mongodb.springmongodb.repository;

import com.techprimers.mongodb.springmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
