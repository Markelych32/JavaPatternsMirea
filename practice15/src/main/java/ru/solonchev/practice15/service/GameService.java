package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.solonchev.practice15.dto.GameDto;
import ru.solonchev.practice15.model.Game;
import ru.solonchev.practice15.repository.GameRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public Game saveGame(GameDto gameDto) {
        return gameRepository.save(
                Game.builder()
                        .gameName(gameDto.getGameName())
                        .creationDate(gameDto.getCreationDate())
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
}
