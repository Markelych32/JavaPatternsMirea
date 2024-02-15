package practice2.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HumanSorter {
    public List<Human> sortHuman(List<Human> list) {
        Comparator<Human> humanComparator = (h1, h2) -> h1.getFirstName().charAt(h1.getFirstName().length() - 1) - h2.getFirstName().charAt(h2.getFirstName().length() - 1);
        Stream<Human> stream = list.stream();
        return stream.filter(human -> human.getAge() > 20)
                .sorted(humanComparator)
                .map(this::addAge).toList();

    }

    private Human addAge(Human human) {
        human.setAge(human.getAge() + 3);
        return human;
    }
}
