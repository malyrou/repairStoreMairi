package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    @Qualifier("otherUserRepositoryImpl")
    private UserRepository repository;

    public User findUser(int id) {

        return repository.getUserById(id)
                .orElseThrow(UserNotFoundException::new);
    }
}
