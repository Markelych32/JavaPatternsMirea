package ru.solonchev.practice15;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.solonchev.practice15.dto.GameDto;
import ru.solonchev.practice15.dto.LevelDto;
import ru.solonchev.practice15.model.Game;
import ru.solonchev.practice15.model.Level;
import ru.solonchev.practice15.service.GameService;
import ru.solonchev.practice15.service.LevelService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/practice15")
public class MainController {
    private final GameService gameService;
    private final LevelService levelService;

    @PostMapping("/game")
    public ResponseEntity<Game> addGame(@RequestBody GameDto game) {
        return ResponseEntity.ok(gameService.saveGame(game));
    }

    @GetMapping("/games")
    public ResponseEntity<List<Game>> getGames() {
        List<Game> games = gameService.getAllGames();
        return ResponseEntity.ok(games);
    }

    @PostMapping("/game/{game_id}/level/{level_id}")
    public ResponseEntity<Void> addLevelToGame(
            @PathVariable("game_id") Long gameId,
            @PathVariable("level_id") Long levelId
    ) {
        gameService.addLevelToGame(gameId, levelId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/game/{game_id}")
    public ResponseEntity<Game> deleteGame(@PathVariable("game_id") Long gameId) {
        return ResponseEntity.ok().body(gameService.deleteGameById(gameId));
    }

    @PostMapping("/level")
    public ResponseEntity<Level> addLevel(@RequestBody LevelDto level) {
        return ResponseEntity.ok(levelService.create(level));
    }

    @GetMapping("/levels")
    public ResponseEntity<List<Level>> getLevels() {
        List<Level> levels = levelService.getAllLevels();
        for (Level level : levels) {
            System.out.println(level.getLevelName() + " " + level.getComplexity());
        }
        return ResponseEntity.ok(levels);
    }

    @DeleteMapping("/level/{level_id}")
    public ResponseEntity<Level> deleteLevel(@PathVariable("level_id") Long levelId) {
        return ResponseEntity.ok().body(levelService.deleteLevelById(levelId));
    }
}
