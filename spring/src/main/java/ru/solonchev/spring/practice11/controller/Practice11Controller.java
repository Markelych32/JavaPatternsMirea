package ru.solonchev.spring.practice11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("practice11")
public class Practice11Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello practice11";
    }
}
