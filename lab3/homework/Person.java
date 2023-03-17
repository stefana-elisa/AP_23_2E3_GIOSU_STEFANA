package lab3.homework;

import java.util.HashMap;
import java.util.Map;

public abstract class Person implements Node, Comparable<Person> {
    public int getRelationships;
    private String name;
    private String birthDate;
    protected Map<Node, String> relationships = new HashMap<>();

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Map<Node, String> getRelationships() {
        return relationships;
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public void addRelationship(Node node, String value) {
        relationships.put(node, value);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date_birth='" + birthDate + '\'' +
                '}';
    }
}
