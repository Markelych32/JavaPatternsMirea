package ru.solonchev.spring.practice14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/practice14")
public class HelloController {
    @GetMapping("/home")
    public String home() {
        return "greeting";
    }
}
