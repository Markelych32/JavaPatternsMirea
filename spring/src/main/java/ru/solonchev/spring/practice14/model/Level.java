package ru.solonchev.spring.practice14.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Level {
    private String complexity;
    private String levelName;
}
