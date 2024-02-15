package practice2.main;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class HumanCreator {
    public List<Human> arrayOfHuman() {
        Human human1 = new Human(19, "Mark", "Solonchev", LocalDate.of(2004, Month.DECEMBER, 13), 64);
        Human human2 = new Human(22, "Andrew", "Skachkov", LocalDate.of(2004, Month.FEBRUARY, 22), 71);
        Human human3 = new Human(44, "Andrek", "Skachkov", LocalDate.of(2004, Month.FEBRUARY, 22), 71);
        return List.of(human1, human2, human3);
    }
}
