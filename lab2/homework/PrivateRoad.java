package lab2.homework;

public class PrivateRoad extends Road{
    private String owner;
    private int fee;

    public PrivateRoad() {
    }

    public PrivateRoad(String name, int length, int speedLimit, Location start, Location finish, String owner, int fee) {
        this.name = name;
        this.length = length;
        this.speedLimit = speedLimit;
        this.start = start;
        this.finish = finish;
        this.owner = owner;
        this.fee = fee;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
