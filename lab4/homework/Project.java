package org.example.lab4.homework;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project project)) return false;
        return getName().equals(project.getName());
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
