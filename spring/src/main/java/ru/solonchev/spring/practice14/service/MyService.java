package ru.solonchev.spring.practice14.service;

import org.springframework.stereotype.Service;
import ru.solonchev.spring.practice14.dto.GameDto;
import ru.solonchev.spring.practice14.dto.LevelDto;
import ru.solonchev.spring.practice14.model.Game;
import ru.solonchev.spring.practice14.model.Level;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {
    private final List<Level> levels = new ArrayList<>();
    private final List<Game> games = new ArrayList<>();

    public void addLevel(LevelDto level) {
        levels.add(
                Level.builder()
                        .complexity(level.getComplexity())
                        .levelName(level.getLevelName())
                        .build()
        );
    }

    public void addGame(GameDto game) {
        games.add(
                Game.builder()
                        .name(game.getName())
                        .creationDate(game.getCreationDate())
                        .build()
        );
    }

    public void removeLevel(String levelName) {
        levels.removeIf(level -> level.getLevelName().equals(levelName));
    }

    public void removeGame(String gameName) {
        games.removeIf(game -> game.getName().equals(gameName));
    }

    public List<LevelDto> getLevels() {
        List<LevelDto> result = new ArrayList<>();
        levels.forEach(level -> {
            result.add(
                    LevelDto.builder()
                            .complexity(level.getComplexity())
                            .levelName(level.getLevelName())
                            .build()
            );
        });
        return result;
    }

    public List<GameDto> getGames() {
        List<GameDto> result = new ArrayList<>();
        games.forEach(game -> {
            result.add(
                    GameDto.builder()
                            .name(game.getName())
                            .creationDate(game.getCreationDate())
                            .build()
            );
        });
        return result;
    }
}
