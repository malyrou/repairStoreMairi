package com.example.demo.repository;

import com.example.demo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> getAuthorByFirstNameAndLastName(String firstName, String lastName);

}
