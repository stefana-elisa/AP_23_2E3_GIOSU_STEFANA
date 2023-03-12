package lab2.homework;

public class Airport extends Location{
    private int numTerminals;

    public Airport() {
    }

    public Airport(String nume, double x, double y, int numTerminals) {
        this.name = nume;
        this.x = x;
        this.y = y;
        this.numTerminals = numTerminals;
    }

    public int getNumTerminals() {
        return numTerminals;
    }

    public void setNumTerminals(int numTerminals) {
        this.numTerminals = numTerminals;
    }
}
