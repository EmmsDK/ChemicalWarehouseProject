package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  // Map the root URL
    public String home() {
        return "index";  // Returns the Thymeleaf template "index.html"
    }
}
