package org.example.lab4.homework;

import com.github.javafaker.Faker;
import org.example.lab4.homework.Algoritm;
import org.example.lab4.homework.AlgoritmGreedy;
import org.example.lab4.homework.Solutie;
import org.example.lab4.homework.Problema;
import org.example.lab4.homework.Project;
import org.example.lab4.homework.Student;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        int n = 9;
        Faker faker = new Faker();
        var students = IntStream.rangeClosed(0, n).mapToObj(i -> new Student(faker.name().firstName())).toArray(Student[]::new);
        var projects = IntStream.rangeClosed(0, n).mapToObj(i -> new Project(faker.animal().name())).toArray(Project[]::new);

        List<Student> listOfStudents = new LinkedList<>();
        listOfStudents.addAll(Arrays.asList(students));
        Collections.sort(listOfStudents, (Student::compareTo));

        Set<Project> setOfProjects = new TreeSet<>(Project::compareTo);
        setOfProjects.addAll(Arrays.asList(projects));

        Problema pb = new Problema(listOfStudents, setOfProjects);
        for(Student student : listOfStudents) {
            int numOfProjects = (int)(Math.random() * 1_000_000) % n + 1;
            List<Project> shuffleList = new ArrayList<>(setOfProjects);
            Collections.shuffle(shuffleList);
            Set<Project> randomSet = new TreeSet<>(shuffleList.subList(0, numOfProjects));
            pb.addPreference(student, randomSet);
        }

        Algoritm alg = new AlgoritmGreedy();
        Solutie sol = alg.solve(pb);
        System.out.println(sol);
    }
}