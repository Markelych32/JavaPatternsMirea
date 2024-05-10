package ru.solonchev.practice15.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.solonchev.practice15.dto.GameDto;
import ru.solonchev.practice15.model.Game;
import ru.solonchev.practice15.repository.GameRepository;
import ru.solonchev.practice15.repository.LevelRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GameServiceTest {
    @Mock
    GameRepository gameRepository;
    @Mock
    LevelRepository levelRepository;
    @InjectMocks
    GameService underTest;

    @Test
    void saveGameTest() {
        when(gameRepository.save(any(Game.class))).thenReturn(Game.builder().build());
        underTest.saveGame(GameDto.builder().build());
        verify(gameRepository, Mockito.times(1)).save(any(Game.class));
    }

    @Test
    void getAllGamesTest() {
        when(gameRepository.findAll()).thenReturn(List.of());
        final List<Game> expectedList = List.of();
        final List<Game> actualList = underTest.getAllGames();
        assertEquals(expectedList, actualList);
    }

    @Test
    void deleteGameByIdTest() {
        Game game = Game.builder()
                .id(1L)
                .gameName("test_name")
                .creationDate("today")
                .build();
        when(gameRepository.findById(anyLong())).thenReturn(Optional.of(game));
        doNothing().when(gameRepository).deleteById(anyLong());
        underTest.deleteGameById(1L);
        verify(gameRepository, times(1)).deleteById(anyLong());
    }
}
