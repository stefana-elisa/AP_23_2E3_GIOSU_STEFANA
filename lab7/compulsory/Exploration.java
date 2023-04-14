package org.lab7.compulsory;

import java.util.ArrayList;
import java.util.List;

public class Exploration {
    SharedMemory mem = new SharedMemory(8);
    ExplorationMap map = new ExplorationMap(5);
    private final List<Robot> robots =new ArrayList<>();

    public ExplorationMap getMap() {
        return map;
    }

    public void addRobot(Robot robot){
        robots.add(robot);
    }
    public void start() {
        for (Robot robot : robots) {
            new Thread(robot).start();
        }
    }
}
