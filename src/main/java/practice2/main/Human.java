package practice2.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private double weight;
}
