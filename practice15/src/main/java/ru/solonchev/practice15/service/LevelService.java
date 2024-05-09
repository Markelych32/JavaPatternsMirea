package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.solonchev.practice15.dto.LevelDto;
import ru.solonchev.practice15.model.Level;
import ru.solonchev.practice15.repository.LevelRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LevelService {
    private final LevelRepository levelRepository;

    @Transactional
    public Level create(LevelDto level) {
        log.info("Creating level {}", level.getLevelName());
        return levelRepository.save(
                Level.builder()
                        .complexity(level.getComplexity())
                        .levelName(level.getLevelName())
                        .build()
        );
    }

    @Transactional
    public List<Level> getAllLevels() {
        log.info("Getting all levels");
        return levelRepository.findAll();
    }

    @Transactional
    public List<Level> getAllLevelsOrderedByLevelName() {
        log.info("Getting all levels ordered by name");
        return levelRepository.findAll(Sort.by(Sort.Direction.ASC, "levelName"));
    }

    @Transactional
    public List<Level> getAllLevelsOrderedByComplexity() {
        log.info("Getting all levels ordered by complexity");
        return levelRepository.findAll(Sort.by(Sort.Direction.ASC, "complexity"));
    }

    @Transactional
    public Level deleteLevelById(Long id) {
        Level level = levelRepository.findById(id).orElseThrow(RuntimeException::new);
        levelRepository.delete(level);
        log.info("Deleting level {}", id);
        return level;
    }
}
