package org.example.lab4.homework;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getName().equals(student.getName());
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
