package org.geekbang.algorithm020;

import java.util.List;

public class BinaryTreeTraversalRecursively {

    public void preorderTraversal(BinaryTreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    public void inorderTraversal(BinaryTreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }

    public void postorderTraversal(BinaryTreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.add(node.val);
    }
}
