package com.example.Library_App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to Library App";
    }
}
