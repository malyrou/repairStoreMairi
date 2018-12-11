package com.example.demo;

import com.example.demo.domain.Author;
import com.example.demo.domain.Owner;
import com.example.demo.service.AuthorService;
import com.example.demo.service.BookService;
import com.example.demo.service.OwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @Autowired
    private OwnerService ownerService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        logger.info("=============================");
        logger.info("====Finding Author by Id====");
        Optional<Author> foundAuthor = authorService.findAuthor(3L);
        foundAuthor.ifPresent(author -> logger.info(author.toString()));
        logger.info("=============================");
        logger.info("=============================");


        logger.info("=============================");
        logger.info("====Getting all authors====");
        authorService.getAllAuthors().forEach(author -> logger.info(author.toString()));
        logger.info("=============================");
        logger.info("=============================");

        logger.info("=============================");
        logger.info("====Finding Author by first name and last name====");
        authorService.findAuthorByFirstNameAndLastName("Alexandros", "Papadiamantis").ifPresent(author -> logger.info(author.toString()));
        logger.info("=============================");
        logger.info("=============================");


        logger.info("=============================");
        logger.info("====Finding Book by Id====");
        bookService.findBook(3L).ifPresent(book -> logger.info(book.toString()));
        logger.info("=============================");
        logger.info("=============================");

        logger.info("=============================");
        logger.info("====Getting all books====");
        bookService.findAll().forEach(book -> logger.info(book.toString()));
        logger.info("=============================");
        logger.info("=============================");

        logger.info("=============================");
        logger.info("====Finding Books by author====");
        foundAuthor.ifPresent(author -> bookService.findByAuthor(author).forEach(book -> logger.info(book.toString())));
        logger.info("=============================");
        logger.info("=============================");

        logger.info("=============================");
        logger.info("====Finding Book by title====");
        bookService.findByTitle("The").forEach(book -> logger.info(book.toString()));
        logger.info("=============================");
        logger.info("=============================");

        logger.info("=============================");
        logger.info("====Finding Owner by Id====");
        Optional<Owner> foundOwner = ownerService.findOwner(3L);
        foundOwner.ifPresent(author -> logger.info(author.toString()));
        logger.info("=============================");
        logger.info("=============================");


        logger.info("=============================");
        logger.info("====Getting all owners====");
        ownerService.getAllOwners().forEach(owner -> logger.info(owner.toString()));
        logger.info("=============================");
        logger.info("=============================");

        logger.info("=============================");
        logger.info("====Finding Owner by first name and last name====");
        ownerService.findOwnerByFirstNameAndLastName("Alexandros", "Papadiamantis").ifPresent(owner -> logger.info(owner.toString()));
        logger.info("=============================");
        logger.info("=============================");



    }
}
