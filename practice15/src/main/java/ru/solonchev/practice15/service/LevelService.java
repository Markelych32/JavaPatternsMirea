package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.solonchev.practice15.dto.LevelDto;
import ru.solonchev.practice15.model.Level;
import ru.solonchev.practice15.repository.LevelRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LevelService {
    private final LevelRepository levelRepository;

    public Level create(LevelDto level) {
        return levelRepository.save(
                Level.builder()
                        .complexity(level.getComplexity())
                        .levelName(level.getLevelName())
                        .build()
        );
    }

    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    public Level deleteLevelById(Long id) {
        Level level = levelRepository.findById(id).orElseThrow(RuntimeException::new);
        levelRepository.delete(level);
        return level;
    }
}