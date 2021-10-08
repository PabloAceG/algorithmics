package algorithmics.clonedirectedgraph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int data;
    public List<Node> neighbors;

    public Node(int d) {
        this.data = d;
        this.neighbors = new ArrayList<Node>();
    }
}
