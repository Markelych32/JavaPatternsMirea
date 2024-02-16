package practice2.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;
}
