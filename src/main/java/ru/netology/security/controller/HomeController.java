package ru.netology.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Home page";
    }

    @GetMapping("/public")
    public String publicPage() {
        return "This page is available without authentication";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "This page requires authentication";
    }
}
