package practice2.main;

import java.util.Comparator;

public class HumanComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        char lastSymbolOfO1 = o1.getFirstName().charAt(o1.getFirstName().length() -1);
        char lastSymbolOfO2 = o2.getFirstName().charAt(o2.getFirstName().length() -1);
        return lastSymbolOfO1 - lastSymbolOfO2;
    }
}
