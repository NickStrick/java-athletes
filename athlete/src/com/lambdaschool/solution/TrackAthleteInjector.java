package com.lambdaschool.solution;

public class TrackAthleteInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApplication(new TrackAthleteImpl());
    }
}