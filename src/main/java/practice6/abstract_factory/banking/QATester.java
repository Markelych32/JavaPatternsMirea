package practice6.abstract_factory.banking;

import practice6.abstract_factory.abstraction.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code...");
    }
}
