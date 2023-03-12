package lab2.homework;

public class Hotel extends Location{
    private int numRooms;
    private String owner;

    public Hotel() {
    }

    public Hotel(String nume, double x, double y, int numRooms, String owner) {
        this.name = nume;
        this.x = x;
        this.y = y;
        this.numRooms = numRooms;
        this.owner = owner;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
