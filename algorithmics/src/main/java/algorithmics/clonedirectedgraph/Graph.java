package algorithmics.clonedirectedgraph;

import java.util.HashMap;

public class Graph {
    private static Node cloneRec(HashMap<Node, Node> visited, Node root) {
        if (root == null) {
            return null;
        }

        // Clone node content and neighbors
        Node cloneRoot = new Node(root.data);
        // Include node in visited to avoid infinite recursion (circles in graph)
        visited.put(root, cloneRoot);

        for(Node neighbor : root.neighbors) {
            Node x = visited.get(neighbor);
            if (x == null) {
                cloneRoot.neighbors.add(cloneRec(visited, neighbor));
            } else {
                cloneRoot.neighbors.add(x);
            }
        }

        return cloneRoot;
    }

    public static Node clone(Node root) {
        HashMap<Node, Node> visited = new HashMap<Node, Node>();

        return cloneRec(visited, root);
    }
}
