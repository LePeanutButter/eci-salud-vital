package com.cvds.parcial.salud.repository;

import com.cvds.parcial.salud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
