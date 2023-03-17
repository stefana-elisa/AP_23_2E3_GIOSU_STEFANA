package org.example.lab4.compulsory;

public class Project implements Comparable<Project> {
    private String name;

    public Project() {
    }

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Proiect{" +
                "nume='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Project other) {
        return this.name.compareTo(other.name);
    }
}
