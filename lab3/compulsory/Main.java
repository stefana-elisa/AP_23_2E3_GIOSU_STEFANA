package lab3.compulsory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]){

        List<Node> nodes = new ArrayList<>();
        Person persoana1 = new Person("John Doe");
        Person persoana2 = new Person("Jane Doe");
        Company compania1 = new Company("ITCompany 1");
        Company compania2 = new Company("ITCompany 2");

        nodes.add(persoana1);
        nodes.add(persoana2);
        nodes.add(compania1);
        nodes.add(compania2);

        Collections.sort(nodes,(t1, t2)-> t1.getName().compareTo(t2.getName()));

        for(Node node : nodes) {
            System.out.println(node.getName());
        }
    }
}
