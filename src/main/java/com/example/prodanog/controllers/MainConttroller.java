package com.example.prodanog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainConttroller {
    @RequestMapping("/")
    public String home(){
        return "Домашняя страница";
    }
}
