package algorithmics.isbinarysearchtree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algorithmics.levelordertraversalbtree.BinaryTreeNode;

public class IsBSTTest {
    @Test
    public void testCase1() {
        assertTrue(IsBST.isBst(null));
    }

    @Test
    public void testCase2() {
        BinaryTreeNode n1 = new BinaryTreeNode(100);
        BinaryTreeNode n2 = new BinaryTreeNode(50);
        BinaryTreeNode n3 = new BinaryTreeNode(200);
        BinaryTreeNode n4 = new BinaryTreeNode(25);
        BinaryTreeNode n5 = new BinaryTreeNode(75);
        BinaryTreeNode n6 = new BinaryTreeNode(125);
        BinaryTreeNode n7 = new BinaryTreeNode(350);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        assertTrue(IsBST.isBst(n1));
    }

    @Test
    public void testCase3() {
        BinaryTreeNode n1 = new BinaryTreeNode(100);
        BinaryTreeNode n2 = new BinaryTreeNode(50);
        BinaryTreeNode n3 = new BinaryTreeNode(200);
        BinaryTreeNode n4 = new BinaryTreeNode(25);
        BinaryTreeNode n5 = new BinaryTreeNode(75);
        BinaryTreeNode n6 = new BinaryTreeNode(90);
        BinaryTreeNode n7 = new BinaryTreeNode(350);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        assertFalse(IsBST.isBst(n1));
    }
}
