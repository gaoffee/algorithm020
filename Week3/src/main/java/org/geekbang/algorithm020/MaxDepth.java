package org.geekbang.algorithm020;

public class MaxDepth {

    public int depth(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftDepth = depth(node.left);
            int rightDepth = depth(node.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
