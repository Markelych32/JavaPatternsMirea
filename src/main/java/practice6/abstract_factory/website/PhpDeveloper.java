package practice6.abstract_factory.website;

import practice6.abstract_factory.abstraction.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code...");
    }
}
