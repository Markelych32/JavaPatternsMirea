package practice6.abstract_factory.banking;

import practice6.abstract_factory.abstraction.Developer;
import practice6.abstract_factory.abstraction.ProjectManager;
import practice6.abstract_factory.abstraction.ProjectTeamFactory;
import practice6.abstract_factory.abstraction.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
