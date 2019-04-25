package com.lambdaschool.solution;

public class MyApplication implements Processor {
    // TODO Add Stretch goal of a court interface injection

    private AthleteCreation ac;

    public MyApplication(AthleteCreation ac) {
        this.ac = ac;
    }

    @Override
    public void displayAthlete() {
        System.out.println("************");
        ac.displayAthlete();
        System.out.println("************\n");
    }
}