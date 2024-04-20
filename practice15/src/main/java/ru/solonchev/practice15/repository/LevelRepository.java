package ru.solonchev.practice15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.solonchev.practice15.model.Level;

@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {
}
