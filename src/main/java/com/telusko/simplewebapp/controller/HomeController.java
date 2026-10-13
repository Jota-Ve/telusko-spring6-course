package com.telusko.simplewebapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to Telusko.";
    }

    @GetMapping("/about")
    public String about() {
        return "We don't teach, we educate.";
    }


}
