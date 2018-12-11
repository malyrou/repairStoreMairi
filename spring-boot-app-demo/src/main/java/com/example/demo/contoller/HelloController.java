package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;

@Controller
public class HelloController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(value = "id") int id) {
        User user;
        try {
            user = service.findUser(id);
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
            return "index";
        }
        model.addAttribute("name", user.getName());
        model.addAttribute("surname", user.getSurname());
        return "hello";
    }
}
