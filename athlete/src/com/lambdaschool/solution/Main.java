package com.lambdaschool.solution;

public class Main {
    public static void main(String[] args) {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockeyAthleteInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Rugby Athlete
        injector = new RugbyAthleteInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballAthleteInjector();
        app = injector.getProcess();
        app.displayAthlete();

    }
}
