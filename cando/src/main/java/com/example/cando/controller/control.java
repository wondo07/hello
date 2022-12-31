package com.example.cando.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class control {

    @GetMapping
    public String post(){
        return "헬러 월드";
    }
}
