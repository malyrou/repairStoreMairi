package com.example.demo.service;

import com.example.demo.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> findAuthor(Long id);

    List<Author> getAllAuthors();

    Optional<Author> findAuthorByFirstNameAndLastName(String firstName, String lastName);
}
