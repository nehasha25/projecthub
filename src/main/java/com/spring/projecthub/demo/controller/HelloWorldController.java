package com.spring.projecthub.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring/rest")
public class HelloWorldController {

    //MApping the rout url to print hello world through getmethod

    @GetMapping("/hello")
    public String helloworld() {
        System.out.println("Hello World");
        return "Hello World";
    }

}
