package lab2.homework;

public class Highway extends Road{
    private double maxGasPrice;
    private int numPitStops;
    private int maxNumLanes;

    public Highway() {
    }

    public Highway(String name, int length, int speedLimit, Location start, Location finish,double maxGasPrice, int numPitStops, int maxNumLanes) {
        this.name = name;
        this.length = length;
        this.speedLimit = speedLimit;
        this.start = start;
        this.finish = finish;
        this.maxGasPrice = maxGasPrice;
        this.numPitStops = numPitStops;
        this.maxNumLanes = maxNumLanes;
    }

    public double getMaxGasPrice() {
        return maxGasPrice;
    }

    public void setMaxGasPrice(double maxGasPrice) {
        this.maxGasPrice = maxGasPrice;
    }

    public int getNumPitStops() {
        return numPitStops;
    }

    public void setNumPitStops(int numPitStops) {
        this.numPitStops = numPitStops;
    }

    public int getMaxNumLanes() {
        return maxNumLanes;
    }

    public void setMaxNumLanes(int maxNumLanes) {
        this.maxNumLanes = maxNumLanes;
    }
}
