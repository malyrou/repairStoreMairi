package com.example.demo.repository;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Page<Book> findAll(Pageable pageable);

    Optional<Book> findById(Long id);

    List<Book> findByTitleContaining(String title);

    Page<Book> findByTitleContaining(String title, Pageable pageable);

    List<Book> findByAuthor(Author author);

    List<Book> findByAuthorAndYear(Author author, String year);

    List<Book> findByAuthorAndTitleAndYear(Author author, String title, String year);

    Book save(Book book);

    void deleteById(Long id);

}
