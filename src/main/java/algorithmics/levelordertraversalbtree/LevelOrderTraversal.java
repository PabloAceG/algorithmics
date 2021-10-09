package algorithmics.levelordertraversalbtree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static String levelOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return "";
        }

        List<Queue<BinaryTreeNode>> queues = new ArrayList<Queue<BinaryTreeNode>>();
        queues.add(new ArrayDeque<BinaryTreeNode>());
        queues.add(new ArrayDeque<BinaryTreeNode>());

        Queue<BinaryTreeNode> currentLevel = queues.get(0);
        Queue<BinaryTreeNode> newLevel = queues.get(1);
        currentLevel.add(root);

        StringBuilder traversalOrder = new StringBuilder();
        int level = 0;
        while (!currentLevel.isEmpty()) {
            BinaryTreeNode node = currentLevel.poll();
            traversalOrder.append(node.data).append(", ");

            if (node.left != null) {
                newLevel.add(node.left);
            }

            if (node.right != null) {
                newLevel.add(node.right);
            }

            if (currentLevel.isEmpty()) {
                traversalOrder
                    .deleteCharAt(traversalOrder.length() - 1)
                    .deleteCharAt(traversalOrder.length() - 1)
                    .append("; ");

                level++;
                currentLevel = queues.get(level % 2);
                newLevel = queues.get((level + 1) % 2);
            }
        }

        // Delete the las ";" part of the string
        traversalOrder
            .deleteCharAt(traversalOrder.length() - 1)
            .deleteCharAt(traversalOrder.length() - 1);

        return traversalOrder.toString();
    }
}
