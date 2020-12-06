package org.geekbang.algorithm020;

import java.util.List;

public class ValidateBinarySearchTree {

    public boolean validate(BinaryTreeNode node, List<Integer> result) {
        if (node == null) {
            return true;
        }
        inorderTraversal(node, result);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) <= result.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void inorderTraversal(BinaryTreeNode node, List<Integer> result) {
        if (node != null) {
            inorderTraversal(node.left, result);
            result.add(node.val);
            inorderTraversal(node.right, result);
        }
    }
}
