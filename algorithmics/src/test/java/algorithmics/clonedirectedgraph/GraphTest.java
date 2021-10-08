package algorithmics.clonedirectedgraph;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.Test;


public class GraphTest {
    private static boolean areGraphsEqualRec(
        Node root1,
        Node root2,
        HashSet<Node> visited) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }

        if (root1.neighbors.size() != root2.neighbors.size()) {
            return false;
        }

        for (Node nbr1 : root1.neighbors) {
            boolean found = false;
            for (Node nbr2 : root2.neighbors) {
                if (nbr1.data == nbr2.data) {
                    if (!visited.contains(nbr1)) {
                        visited.add(nbr1);
                        areGraphsEqualRec(nbr1, nbr2, visited);
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
    }


    @Test
    public void testCase1() {
        assertNull(Graph.clone(null));
    }


    @Test
    public void testCase2() {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n0.neighbors.add(n2);
        n0.neighbors.add(n3);
        n0.neighbors.add(n4);
        n1.neighbors.add(n2);
        n2.neighbors.add(n0);
        n3.neighbors.add(n2);
        n4.neighbors.add(n0);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        HashSet<Node> visited = new HashSet<Node>();

        assertTrue(areGraphsEqualRec(n0, Graph.clone(n0), visited));


    }
}
