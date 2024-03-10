package practice6.abstract_factory;

import practice6.abstract_factory.abstraction.Developer;
import practice6.abstract_factory.abstraction.ProjectManager;
import practice6.abstract_factory.abstraction.ProjectTeamFactory;
import practice6.abstract_factory.abstraction.Tester;
import practice6.abstract_factory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Bank System...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
