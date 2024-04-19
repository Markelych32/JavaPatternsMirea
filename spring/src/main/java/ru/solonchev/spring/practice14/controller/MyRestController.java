package ru.solonchev.spring.practice14.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.solonchev.spring.practice14.dto.GameDto;
import ru.solonchev.spring.practice14.dto.LevelDto;
import ru.solonchev.spring.practice14.service.MyService;

import java.util.List;

@RestController
@RequestMapping("/practice14")
@RequiredArgsConstructor
public class MyRestController {

    private final MyService myService;

    @PostMapping("/level")
    public ResponseEntity<Void> addLevel(@RequestBody LevelDto levelDto) {
        myService.addLevel(levelDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/game")
    public ResponseEntity<Void> addGame(@RequestBody GameDto gameDto) {
        myService.addGame(gameDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/level/{levelName}")
    public ResponseEntity<Void> deleteLevel(@PathVariable String levelName) {
        myService.removeLevel(levelName);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/game/{gameName}")
    public ResponseEntity<Void> deleteGame(@PathVariable String gameName) {
        myService.removeGame(gameName);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/levels")
    public ResponseEntity<List<LevelDto>> getLevels() {
        return ResponseEntity.ok(myService.getLevels());
    }

    @GetMapping("/games")
    public ResponseEntity<List<GameDto>> getGames() {
        return ResponseEntity.ok(myService.getGames());
    }
}