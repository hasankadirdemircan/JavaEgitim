package com.example.springweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/say")
    public String sayHello() {
        return "hello world!";
    }

    @PostMapping("/post")
    public String postHello() {
        return "hello world! post";
    }
}
