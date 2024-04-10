package ru.solonchev.spring.practice13;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String lastName;
    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void logInfo() {
        log.info(name);
        log.info(lastName);
        log.info(group);
    }
}
