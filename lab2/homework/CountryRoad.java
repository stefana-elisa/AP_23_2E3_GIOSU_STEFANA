package lab2.homework;

public class CountryRoad extends Road{
    private boolean concrete;

    public CountryRoad() {
    }

    public CountryRoad(String name, int length, int speedLimit, Location start, Location finish, boolean concrete) {
        this.name = name;
        this.length = length;
        this.speedLimit = speedLimit;
        this.start = start;
        this.finish = finish;
        this.concrete = concrete;
    }

    public boolean isConcrete() {
        return concrete;
    }

    public void setConcrete(boolean concrete) {
        this.concrete = concrete;
    }
}
