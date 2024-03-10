package practice6.abstract_factory;

import practice6.abstract_factory.abstraction.Developer;
import practice6.abstract_factory.abstraction.ProjectManager;
import practice6.abstract_factory.abstraction.ProjectTeamFactory;
import practice6.abstract_factory.abstraction.Tester;
import practice6.abstract_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
    }
}
