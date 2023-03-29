package org.example.lab4.homework;
import org.example.lab4.homework.Problema;
import org.example.lab4.homework.Project;
import org.example.lab4.homework.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class AlgoritmGreedy implements Algoritm{
    private List<Student> studenti;
    private List<Pereche> alocari;
    private boolean checkIfProjectWasAllocated(Project project) {
        for(Pereche pair : alocari) {
            if(pair.getProject() != null) {
                if(pair.getProject().equals(project))
                    return false;
            }
        }
        return true;
    }
    @Override
    public Solutie solve(Problema pb){
        studenti = pb.getStudenti();
        Collections.sort(studenti, (Comparator.comparingInt(pb::getNumberOfPreferences)));
        alocari = new ArrayList<>();
        for(Student student : studenti) {
            boolean added = false;
            for(Project project : pb.getPreferinte().get(student)) {
                if(checkIfProjectWasAllocated(project)) {
                    Pereche pair = new Pereche(student, project);
                    alocari.add(pair);
                    added = true;
                    break;
                }
            }
            if(!added) {
                Pereche pair = new Pereche(student, null);
                alocari.add(pair);
            }
        }

        return new Solutie(alocari);
    }
}
