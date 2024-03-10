package practice6.abstract_factory.banking;

import practice6.abstract_factory.abstraction.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
