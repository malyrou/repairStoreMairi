package com.example.demo.repository;

import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Map<Integer, User> users = Map.of(1, new User(1, "Spyros", "A"),
            2, new User(2, "Christos", "P"));

    public Optional<User> getUserById(int id) {
        return Optional.of(users.get(id));
    }


}
