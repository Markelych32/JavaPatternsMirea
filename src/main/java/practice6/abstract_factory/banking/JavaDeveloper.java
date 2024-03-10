package practice6.abstract_factory.banking;

import practice6.abstract_factory.abstraction.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
