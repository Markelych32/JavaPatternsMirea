package practice2;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class HumanCreator {
    public static List<Human> arrayOfHuman() {
        return List.of(
                new Human(19, "Mark", "Solonchev", LocalDate.of(2004, Month.DECEMBER, 13), 64),
                new Human(22, "Andrew", "Skachkov", LocalDate.of(2001, Month.FEBRUARY, 22), 71),
                new Human(26, "Katy", "Perry", LocalDate.of(1996, Month.JANUARY, 8), 58),
                new Human(69, "Ivan", "Ivanovich", LocalDate.of(1956, Month.AUGUST, 17), 77)
        );
    }
}
