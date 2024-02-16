package practice2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> listOfPeople = HumanCreator.arrayOfHuman();
        HumanComparator humanComparator = new HumanComparator();

        double averageYear = listOfPeople.stream()
                .mapToInt(Human::getAge)
                .average()
                .getAsDouble();
        System.out.printf("The average year: %s%n", averageYear);

        listOfPeople = listOfPeople.stream()
                .filter(h -> h.getAge() > 20)
                .sorted(humanComparator)
                .peek(h -> h.setAge(h.getAge() + 3))
                .collect(Collectors.toList());
        listOfPeople.forEach(System.out::println);

    }
}
