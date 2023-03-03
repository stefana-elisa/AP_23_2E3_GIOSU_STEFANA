package lab2.compulsory;
/**
 *
 * @author Giosu Stefana
 */
public class Location {
    private String name;
    private LocationType type;
    private double x;
    private double y;

    public Location(){ }
    public Location(String newName, LocationType newType, double newX, double newY){
        name = newName;
        type = newType;
        x = newX;
        y = newY;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public LocationType getType(){
        return type;
    }
    public void setType(LocationType newType){
        type = newType;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
