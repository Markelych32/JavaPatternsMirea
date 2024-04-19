package ru.solonchev.spring.practice14.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Game {
    private String name;
    private String creationDate;
}
