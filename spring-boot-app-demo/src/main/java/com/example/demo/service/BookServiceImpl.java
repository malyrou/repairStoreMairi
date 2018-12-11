package com.example.demo.service;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Optional<Book> findBook(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> findByAuthorAndYear(Author author, String year) {
        return bookRepository.findByAuthorAndYear(author, year);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }


}
