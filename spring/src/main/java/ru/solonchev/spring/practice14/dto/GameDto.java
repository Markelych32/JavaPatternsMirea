package ru.solonchev.spring.practice14.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GameDto {
    private String name;
    @JsonProperty("creation_date")
    private String creationDate;
}
