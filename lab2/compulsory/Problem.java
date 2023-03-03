package lab2.compulsory;

public class Problem {
    private Location[] locations;
    private Road[] roads;

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
}
