package com.example.Library_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to Library App";
    }

    @PostMapping("/add")
    public String AddBooks(){
        return  "Welcome to Add Books";
    }

    @PostMapping("/search")
    public  String SearchBooks(){
        return  "Welcome to search books";
    }
}
