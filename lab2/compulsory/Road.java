package lab2.compulsory;
/**
 *
 * @author Giosu Stefana
 */
public class Road {

    private String name;
    private RoadType type;
    private int length;
    private int speedLimit;

    public Road() {
    }

    public Road(String newName, RoadType newType, int newLength, int newSpeedLimit){
        type = newType;
        length = newLength;
        speedLimit = newSpeedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public RoadType getType(){
        return type;
    }

    public void setType(RoadType newType){
        type = newType;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int newLength){
        length = newLength;
    }

    public int getSpeedLimit(){
        return speedLimit;
    }

    public void setSpeedLimit(int newSpeedLimit){
        speedLimit = newSpeedLimit;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Road)) {
            return false;
        }
        Road other = (Road) obj;
        return name.equals(other.name);
    }

}
