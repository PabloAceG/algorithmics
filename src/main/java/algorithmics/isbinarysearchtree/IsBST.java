package algorithmics.isbinarysearchtree;

import algorithmics.levelordertraversalbtree.BinaryTreeNode;

public class IsBST {
    private static boolean isBstRec(BinaryTreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data < min ||
            root.data > max) {
            return false;
        }

        return isBstRec(root.left, min, root.data) &&
               isBstRec(root.right, root.data, max);
    }

    public static boolean isBst(BinaryTreeNode root) {
        return isBstRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
