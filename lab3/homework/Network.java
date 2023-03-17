package lab3.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Network {
    private List<Node> nodes = new ArrayList<>();

    public Network(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
    public List<Node> getNodes() {
        return nodes;
    }

    public int nodeImportance(Node node){
        int importance = 0;
        if(node instanceof Person)
            importance = ((Person) node).relationships.size();

        for(Node each:nodes) {
            if (each instanceof Person) {
                Iterator<Map.Entry<Node, String>> iteratorNou = ((Person) each).relationships.entrySet().iterator();
                while(iteratorNou.hasNext()) {
                    Map.Entry<Node, String> entry = iteratorNou.next();
                    Node key = entry.getKey();
                    if (key.getName().equals((node.getName()))){
                        importance++;
                    }
                }
            }
        }
        return importance;
    }

    @Override
    public String toString() {
        return "Network{" +
                "nodes=" + nodes +
                '}';
    }
}
