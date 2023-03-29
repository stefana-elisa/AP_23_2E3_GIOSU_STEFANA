package org.example.lab4.homework;

import java.util.*;
public class Problema {
    private List<Student> studenti;
    private Set<Project> proiecte;
    private Map<Student, Set<Project>> preferinte;

    public Problema(List<Student> studenti, Set<Project> proiecte) {
        this.studenti = studenti;
        this.proiecte = proiecte;
        this.preferinte = new HashMap<>();
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public Set<Project> getProiecte() {
        return proiecte;
    }

    public Map<Student, Set<Project>> getPreferinte() {
        return preferinte;
    }

    private boolean checkStudent(Student studentToCheck) {
        for(Student student : studenti) {
            if(student.equals(studentToCheck))
                return true;
        }
        return false;
    }

    public void addPreference(Student student, Set<Project> projects) throws Exception {
        if(checkStudent(student))
            preferinte.put(student, projects);
        else
            throw new Exception("Studentul " + student.getName() + " nu exista!");
    }

    public int getNumberOfPreferences(Student student) {
        return preferinte.get(student).size();
    }

    private int averageNumberOfPreferences() {
        int sum = 0;
        for(Student student : studenti)
            sum += getNumberOfPreferences(student);
        return sum / studenti.size();
    }

    public void showStudentsBellowAverage() {
        studenti.stream()
                .filter(s -> getNumberOfPreferences(s) < averageNumberOfPreferences())
                .forEach(System.out::println);
    }
}
