package lab3.compulsory;

public class Person implements Node, Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
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
}
