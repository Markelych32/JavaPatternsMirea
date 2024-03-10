package practice8.strategy;

import practice8.strategy.activity.Coding;
import practice8.strategy.activity.Reading;
import practice8.strategy.activity.Sleeping;
import practice8.strategy.activity.Training;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
