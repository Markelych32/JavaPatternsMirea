package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.walk;

@Service
@EnableScheduling
@RequiredArgsConstructor
@Slf4j
public class ScheduledService {
    private final GameService gameService;
    private final LevelService levelService;

    @Scheduled(fixedRateString = "PT30M")
    public void remadeFiles() throws Exception {
        try {
            walk(Path.of("practice15/src/main/resources/model")).filter(Files::isRegularFile).forEach(file -> {
                try {
                    Files.delete(file);
                } catch (Exception e) {
                    log.error("Error with deleting file");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        File gameFile = new File("practice15/src/main/resources/model/game.txt");
        File levelFile = new File("practice15/src/main/resources/model/level.txt");

        FileWriter gameWriter = new FileWriter(gameFile);
        gameWriter.write(gameService.getAllGames().toString());

        FileWriter levelWriter = new FileWriter(levelFile);
        levelWriter.write(levelService.getAllLevels().toString());

        gameWriter.close();
        levelWriter.close();
    }
}
