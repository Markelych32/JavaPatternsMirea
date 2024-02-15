package practice2.main;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HumanCreator creator = new HumanCreator();
        HumanSorter sorter = new HumanSorter();
        List<Human> humans = creator.arrayOfHuman();
        humans = sorter.sortHuman(humans);
        System.out.println(Arrays.toString(humans.toArray()));
    }
}
