package practice6.abstract_factory.website;

import practice6.abstract_factory.abstraction.Developer;
import practice6.abstract_factory.abstraction.ProjectManager;
import practice6.abstract_factory.abstraction.ProjectTeamFactory;
import practice6.abstract_factory.abstraction.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
