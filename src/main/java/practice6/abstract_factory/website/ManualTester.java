package practice6.abstract_factory.website;

import practice6.abstract_factory.abstraction.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests website...");
    }
}
