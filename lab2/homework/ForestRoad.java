package lab2.homework;

public class ForestRoad extends Road{
    private boolean restricted;
    private int fee;

    public ForestRoad() {
    }

    public ForestRoad(String name, int length, int speedLimit, Location start, Location finish, boolean restricted, int fee) {
        this.name = name;
        this.length = length;
        this.speedLimit = speedLimit;
        this.start = start;
        this.finish = finish;
        this.restricted = restricted;
        this.fee = fee;
    }

    public boolean isRestricted() {
        return restricted;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
