package org.example.lab4.homework;

import org.example.lab4.homework.Project;
import org.example.lab4.homework.Student;
public class Pereche {
    private Student student;
    private Project project;

    public Pereche(Student student, Project project) {
        this.student = student;
        this.project = project;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "student=" + student +
                ", project=" + project +
                '}';
    }
}
