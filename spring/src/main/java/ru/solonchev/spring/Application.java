package ru.solonchev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.solonchev.spring.practice12.MyFileWriter;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);
        new MyFileWriter();
        SpringApplication.exit(context);
    }
}
