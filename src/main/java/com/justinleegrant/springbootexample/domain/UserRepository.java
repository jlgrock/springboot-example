package com.justinleegrant.springbootexample.domain;

import com.justinleegrant.springbootexample.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);
    public List<User> findAllByName(String name);
}