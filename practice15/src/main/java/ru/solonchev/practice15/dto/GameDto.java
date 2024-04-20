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
public class GameDto {
    @JsonProperty("game_name")
    private String gameName;
    @JsonProperty("creation_date")
    private String creationDate;
}
