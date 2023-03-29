package org.example.lab4.homework;
import org.example.lab4.homework.Pereche;

import java.util.List;
public class Solutie {
    private List<Pereche> matching;

    public Solutie(List<Pereche> matching) {
        this.matching = matching;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder();
        for(Pereche pair : matching)
            msg.append(pair).append("\n");
        return msg.toString();
    }
}
