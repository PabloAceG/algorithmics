package algorithmics.levelordertraversalbtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LevelOrderTraversalTest {
    @Test
    public void testCase1() {
            assertEquals("", LevelOrderTraversal.levelOrderTraversal(null));
    }
        

    @Test
    public void testCase2() {
        BinaryTreeNode n1 = new BinaryTreeNode(100);
        BinaryTreeNode n2 = new BinaryTreeNode(50);
        BinaryTreeNode n3 = new BinaryTreeNode(200);
        BinaryTreeNode n4 = new BinaryTreeNode(25);
        BinaryTreeNode n5 = new BinaryTreeNode(75);
        BinaryTreeNode n6 = new BinaryTreeNode(350);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;

        assertEquals("100; 50, 200; 25, 75, 350", LevelOrderTraversal.levelOrderTraversal(n1));
    }
}
