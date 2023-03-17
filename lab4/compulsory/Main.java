package org.example.lab4.compulsory;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        var students = IntStream.rangeClosed(0, 2)
            .mapToObj(i -> new Student("S" + i) )
            .toArray(Student[]::new);

        var projects = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new Project("P" + i) )
                .toArray(Project[]::new);

        Comparator<Student> comparator1 = (s1, s2) -> s1.getName().compareTo(s2.getName());
        LinkedList<String> listOfStudents = new LinkedList<String>();

        for (Student s : students) {
            listOfStudents.add(s.toString());
        }
        Collections.sort(listOfStudents);
        for (Student s : students) {
            System.out.println(s);
        }

        TreeSet<Project> listOfProjects = new TreeSet<>(List.of(projects));

        for (Project p : projects) {
            System.out.println(p);
        }
    }
}