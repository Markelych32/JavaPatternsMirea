package ru.solonchev.practice15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.solonchev.practice15.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    Game deleteGameByGameName(String gameName);
}
