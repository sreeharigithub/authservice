package com.example.authservice.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserAuthentication {


    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello";
    }
}
