package practice6.abstract_factory.website;

import practice6.abstract_factory.abstraction.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
