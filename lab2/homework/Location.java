package lab2.homework;

/**
 *
 * @author Giosu Stefana
 */
public abstract class Location {
    protected String name;
    protected double x;
    protected double y;
    protected Road[] convergentRoads;


    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public double getX(){
        return x;
    }
    public void setX(double newX){
        x = newX;
    }

    public double getY(){
        return y;
    }
    public void setY(double newY){
        y = newY;
    }

    public Road[] getConvergentRoads() {
        return convergentRoads;
    }

    public void setConvergentRoads(Road[] convergentRoads) {
        this.convergentRoads = convergentRoads;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Location)) {
            return false;
        }
        Location other = (Location) obj;
        return name.equals(other.name);
    }
}
