package org.example.lab4.compulsory;

public class Student implements Comparable<Student>{
    private String name;

    public Student() {
    }

    public Student(String name) {
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
        return "Student{" +
                "nume='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

}
