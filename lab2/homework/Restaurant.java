package lab2.homework;

public class Restaurant extends Location{
    private int numTables;
    private String todaysMenu;
    private String owner;

    public Restaurant() {
    }

    public Restaurant(String nume, double x, double y, int numTables, String todaysMenu, String owner) {
        this.numTables = numTables;
        this.todaysMenu = todaysMenu;
        this.owner = owner;
        this.name = nume;
        this.x = x;
        this.y = y;
        this.convergentRoads = convergentRoads;
    }


    public int getNumTables() {
        return numTables;
    }

    public void setNumTables(int numTables) {
        this.numTables = numTables;
    }

    public String getTodaysMenu() {
        return todaysMenu;
    }

    public void setTodaysMenu(String todaysMenu) {
        this.todaysMenu = todaysMenu;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
