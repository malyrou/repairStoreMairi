package com.example.demo.repository;

import java.util.Optional;

import com.example.demo.domain.User;

public interface UserRepository {

    Optional<User> getUserById(int id);
}
