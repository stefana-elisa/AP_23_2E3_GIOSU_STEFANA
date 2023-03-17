package lab3.homework;

public class Company implements Node, Comparable<Company>{
    private String name;
    private int numEmployees;

    public Company(String name, int numEmployees) {
        this.name = name;
        this.numEmployees = numEmployees;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Company other) {
        return this.name.compareTo(other.name);
    }

}
