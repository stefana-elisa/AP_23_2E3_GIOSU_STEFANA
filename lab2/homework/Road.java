package lab2.homework;

/**
 *
 * @author Giosu Stefana
 */
public abstract class Road {

    protected String name;
    protected int length;
    protected int speedLimit;
    protected Location start;
    protected Location finish;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
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

    public Location getStart() {
        return start;
    }

    public void setStart(Location start) {
        this.start = start;
    }

    public Location getFinish() {
        return finish;
    }

    public void setFinish(Location finish) {
        this.finish = finish;
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
