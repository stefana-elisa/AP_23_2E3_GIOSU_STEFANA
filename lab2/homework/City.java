package lab2.homework;

public class City extends Location{
    private int popSize;
    private String mayor;

    public City() {
    }

    public City(String nume, double x, double y, int popSize, String mayor) {
        this.name = nume;
        this.x = x;
        this.y = y;
        this.popSize = popSize;
        this.mayor = mayor;
    }

    public int getPopSize() {
        return popSize;
    }

    public void setPopSize(int popSize) {
        this.popSize = popSize;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }
}
