package practice8.strategy.activity;

import practice8.strategy.activity.Activity;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
