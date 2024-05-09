package ru.solonchev.practice15;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.solonchev.practice15.dto.GameDto;
import ru.solonchev.practice15.dto.LevelDto;
import ru.solonchev.practice15.model.Game;
import ru.solonchev.practice15.model.Level;
import ru.solonchev.practice15.service.EmailService;
import ru.solonchev.practice15.service.GameService;
import ru.solonchev.practice15.service.LevelService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/practice15")
public class MainController {
    private final GameService gameService;
    private final LevelService levelService;
    private final EmailService emailService;

    @Value("${spring.mail.username}")
    private String email;

    @PostMapping("/email")
    public void sendEmailMessage() {
        emailService.sendEmail(email, "Тестовое Текстовое сообщение");
    }

    @PostMapping("/game")
    public ResponseEntity<Game> addGame(@RequestBody GameDto game) {
        return ResponseEntity.ok(gameService.saveGame(game));
    }

    @GetMapping("/games")
    public ResponseEntity<List<Game>> getGames() {
        List<Game> games = gameService.getAllGames();
        return ResponseEntity.ok(games);
    }

    @GetMapping("/games/order/name")
    public ResponseEntity<List<Game>> getOrderedGamesByName() {
        return ResponseEntity.ok().body(gameService.getSortedGamesByName());
    }

    @GetMapping("/games/order/creation")
    public ResponseEntity<List<Game>> getOrderedGamesByCreation() {
        return ResponseEntity.ok().body(gameService.getSortedGamesByCreationDate());
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
        return ResponseEntity.ok(levels);
    }

    @GetMapping("/levels/order/name")
    public ResponseEntity<List<Level>> getLevelsOrderedByName() {
        return ResponseEntity
                .ok()
                .body(levelService.getAllLevelsOrderedByLevelName());
    }

    @GetMapping("/levels/order/complexity")
    public ResponseEntity<List<Level>> getLevelsOrderedByComplexity() {
        return ResponseEntity
                .ok()
                .body(levelService.getAllLevelsOrderedByComplexity());
    }

    @DeleteMapping("/level/{level_id}")
    public ResponseEntity<Level> deleteLevel(@PathVariable("level_id") Long levelId) {
        return ResponseEntity.ok().body(levelService.deleteLevelById(levelId));
    }
}
