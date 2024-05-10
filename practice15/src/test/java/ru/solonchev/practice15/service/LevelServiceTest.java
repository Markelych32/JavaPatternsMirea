package ru.solonchev.practice15.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.solonchev.practice15.dto.LevelDto;
import ru.solonchev.practice15.model.Level;
import ru.solonchev.practice15.repository.LevelRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LevelServiceTest {

    @Mock
    LevelRepository levelRepository;
    @InjectMocks
    LevelService underTest;

    @Test
    void createTest() {
        when(levelRepository.save(any(Level.class))).thenReturn(Level.builder().build());
        underTest.create(LevelDto.builder().build());
        verify(levelRepository, times(1)).save(any(Level.class));
    }

    @Test
    void getAllLevelsTest() {
        when(levelRepository.findAll()).thenReturn(List.of());
        final List<Level> expectedResult = List.of();
        final List<Level> actualResult = underTest.getAllLevels();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deleteLevelByIdTest() {
        when(levelRepository.findById(anyLong())).thenReturn(Optional.of(Level.builder().build()));
        doNothing().when(levelRepository).delete(any(Level.class));
        underTest.deleteLevelById(1L);
        verify(levelRepository, times(1)).delete(any(Level.class));
    }
}
