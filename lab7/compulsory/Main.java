package org.lab7.compulsory;

public class Main {
    public static void main(String[] args) {
        var explore = new Exploration();
        SharedMemory mem = new SharedMemory(8);
        explore.addRobot(new Robot("Mars rover", explore, mem));
        explore.addRobot(new Robot("Curiosity", explore, mem));
        explore.addRobot(new Robot("Bumblebee", explore, mem));
        explore.addRobot(new Robot("Eve", explore, mem));

        explore.start();
    }
}