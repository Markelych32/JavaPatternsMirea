package ru.solonchev.practice15.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "game")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "game_name", unique = true, nullable = false)
    private String gameName;
    @Column(name = "creation_date")
    private String creationDate;
    @OneToMany(mappedBy = "game", fetch = FetchType.EAGER)
    private List<Level> levels = new ArrayList<>();
}
