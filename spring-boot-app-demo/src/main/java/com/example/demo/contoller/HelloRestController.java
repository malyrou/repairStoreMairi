package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class HelloRestController {

    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public User hello(@RequestParam(value="id") int id) {
        try {
            return service.findUser(id);
        } catch (UserNotFoundException ex) {
            return null;
        }
    }
}
