package ru.solonchev.practice15.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LevelDto {
    @JsonProperty("level_name")
    private String levelName;
    @JsonProperty("complexity")
    private String complexity;
}
