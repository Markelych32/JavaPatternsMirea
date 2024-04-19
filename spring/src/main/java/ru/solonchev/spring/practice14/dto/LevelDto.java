package ru.solonchev.spring.practice14.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LevelDto {
    private String complexity;
    @JsonProperty("level_name")
    private String levelName;
}
