package ru.solonchev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.solonchev.spring.practice10.test.AlgorithmTest;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);
        // PRACTICE 10
//        var test = context.getBean(AlgorithmTest.class);
//        test.test();
    }

}
