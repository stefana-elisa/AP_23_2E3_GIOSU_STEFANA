package lab3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String args[]){
        String[] apps = {"Adobe Illustrator", "Adobe Photoshop", "Figma"};
        String[] languages = {"C++", "java", "C#", "Python"};

        Person person1 = new Designer("Andreea", "24.12.2000", apps);
        Person person2 = new Designer("Eli", "05.09.1998", apps);
        Person person3 = new Programmer("Andrei", "08.02.1999", languages);
        Person person4 = new Programmer("Khalesee", "13.05.2001", languages);

        Company company1 = new Company("Bytex", 578);
        Company company2 = new Company("Amber Studio", 189);

        List<Node> nodes = new ArrayList<>();

        nodes.add(person1);
        nodes.add(person2);
        nodes.add(person3);
        nodes.add(person4);
        nodes.add(company1);

        Network retea = new Network(nodes);

        Comparator<Node> compareByImportance = (o1, o2) -> Integer.compare(retea.nodeImportance(o2), retea.nodeImportance(o1));

        person1.addRelationship(person2, "bestfriends");
        person1.addRelationship(person4, "siblings");
        person2.addRelationship(person3, "parteners");
        person3.addRelationship(person4, "friends");
        person4.addRelationship(company1, "boss");
        person2.addRelationship(company1, "intern");

        System.out.println("Importanta companiei " + company1.getName() + " este " + retea.nodeImportance(company1));
        System.out.println("Importanta persoanei " + person1.getName() + " este " + retea.nodeImportance(person1));
        System.out.println("Importanta persoanei " + person2.getName() + " este " + retea.nodeImportance(person2));
        System.out.println("Importanta persoanei " + person3.getName() + " este " + retea.nodeImportance(person3));
        System.out.println("Importanta persoanei " + person4.getName() + " este " + retea.nodeImportance(person4));

        nodes.sort(compareByImportance);
        System.out.println("Nodurile ordonate dupa importanta: " + retea.toString());
    }
}
