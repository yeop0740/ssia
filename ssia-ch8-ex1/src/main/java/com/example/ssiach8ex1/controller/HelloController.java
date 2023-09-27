package com.example.ssiach8ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!\n";
    }

    @GetMapping("/ciao")
    public String ciao() {
        return "Ciao!\n";
    }

    @GetMapping("/hola")
    public String hola() {
        return "Hola!\n";
    }
}
