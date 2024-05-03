package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
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
public class GameService {
    private final GameRepository gameRepository;
    private final LevelRepository levelRepository;

    public Game saveGame(GameDto gameDto) {
        return gameRepository.save(
                Game.builder()
                        .gameName(gameDto.getGameName())
                        .creationDate(gameDto.getCreationDate())
                        .levels(new ArrayList<>())
                        .build()
        );
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Transactional
    public Game deleteGame(String gameName) {
        return gameRepository.deleteGameByGameName(gameName);
    }

    public Game deleteGameById(Long id) {
        Game game = gameRepository.findById(id).orElseThrow(RuntimeException::new);
        gameRepository.deleteById(id);
        return game;
    }

    public void addLevelToGame(Long gameId, Long levelId) {
        Game game = gameRepository.findById(gameId).orElseThrow(RuntimeException::new);
        Level level = levelRepository.findById(levelId).orElseThrow(RuntimeException::new);
        level.setGame(game);
        levelRepository.save(level);
    }

    public List<Game> getGamesByName() {
        return gameRepository.findAllByOrderByGameNameAsc();
    }

    public List<Game> getSortedGamesByName() {
        return gameRepository.findAll(Sort.by(Sort.Direction.ASC, "gameName"));
    }

    public List<Game> getSortedGamesByCreationDate() {
        return gameRepository.findAll(Sort.by(Sort.Direction.ASC, "creationDate"));
    }
}
