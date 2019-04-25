package com.lambdaschool.solution;

public class RugbyAthleteInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new RugbyAthleteImpl());
    }
}