package com.example.demo.service;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Optional<Book> findBook(Long id);

    List<Book> findAll();

    List<Book> findByAuthor(Author author);

    List<Book> findByAuthorAndYear(Author author, String year);

    List<Book> findByTitle(String title);
}
