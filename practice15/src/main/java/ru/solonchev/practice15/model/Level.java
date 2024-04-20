package ru.solonchev.practice15.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "level")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "level_name", nullable = false, unique = true)
    private String levelName;
    private String complexity;
}
