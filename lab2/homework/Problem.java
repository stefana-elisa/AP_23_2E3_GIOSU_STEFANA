package lab2.homework;

import lab2.homework.Location;
import lab2.homework.Road;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Problem {
    private Location[] locations;
    private Road[] roads;
    private boolean valid = false;

    public Problem() {
    }

    public Problem(Location[] locations, Road[] roads) {
        this.locations = locations;
        this.roads = roads;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public Road[] getRoads() {
        return roads;
    }

    public void setRoads(Road[] roads) {
        this.roads = roads;
    }

    public boolean isValid(Problem problem){
        int i = 0;
        double distance;
        while(roads[i] != null){
            distance = Math.sqrt((roads[i].getFinish().x - roads[i].getStart().x) * (roads[i].getFinish().x - roads[i].getStart().x) + (roads[i].getFinish().y - roads[i].getStart().y) * (roads[i].getFinish().y - roads[i].getStart().y));
            if(distance > roads[i].length)
                return false;
        }

        return true;
    }

    /*public boolean routeExists(Location start, Location end) {
        Set<Location> visited = new HashSet<>();
        Stack<Location> stack = new Stack<>();

        visited.add(start);
        stack.push(start);

        while(!stack.isEmpty()) {
            Location current = stack.pop();

            if(current.getName() == end.getName()) {
                return true;
            }

            for(Location adj : current.getAdjacent()) {
                // keep track of visited nodes
                if(!visited.contains(adj)) {
                    stack.push(adj);
                    visited.add(adj);
                }
            }
        }

        return false;
    }*/
}
