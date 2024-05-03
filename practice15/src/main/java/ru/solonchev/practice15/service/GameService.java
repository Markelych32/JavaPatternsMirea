package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.solonchev.practice15.dto.GameDto;
import ru.solonchev.practice15.model.Game;
import ru.solonchev.practice15.model.Level;
import ru.solonchev.practice15.repository.GameRepository;
import ru.solonchev.practice15.repository.LevelRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class GameService {
    private final GameRepository gameRepository;
    private final LevelRepository levelRepository;

    public Game saveGame(GameDto gameDto) {
        log.info("Saving game {}", gameDto.getGameName());
        return gameRepository.save(
                Game.builder()
                        .gameName(gameDto.getGameName())
                        .creationDate(gameDto.getCreationDate())
                        .levels(new ArrayList<>())
                        .build()
        );
    }

    public List<Game> getAllGames() {
        log.info("Getting All games");
        return gameRepository.findAll();
    }

    @Transactional
    public Game deleteGame(String gameName) {
        log.info("Deleting game with name {}", gameName);
        return gameRepository.deleteGameByGameName(gameName);
    }

    public Game deleteGameById(Long id) {
        Game game = gameRepository.findById(id).orElseThrow(RuntimeException::new);
        gameRepository.deleteById(id);
        log.info("Deleting game with id {}", id);
        return game;
    }

    public void addLevelToGame(Long gameId, Long levelId) {
        Game game = gameRepository.findById(gameId).orElseThrow(RuntimeException::new);
        Level level = levelRepository.findById(levelId).orElseThrow(RuntimeException::new);
        level.setGame(game);
        log.info("Adding level {} to game {}", levelId, gameId);
        levelRepository.save(level);
    }

    public List<Game> getSortedGamesByName() {
        log.info("Getting games ordered by name");
        return gameRepository.findAll(Sort.by(Sort.Direction.ASC, "gameName"));
    }

    public List<Game> getSortedGamesByCreationDate() {
        log.info("Getting games ordered by creation date");
        return gameRepository.findAll(Sort.by(Sort.Direction.ASC, "creationDate"));
    }
}
