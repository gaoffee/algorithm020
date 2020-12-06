package org.geekbang.algorithm020;

public class InvertBinaryTree {

    public BinaryTreeNode invert(BinaryTreeNode node) {
        if (node == null) {
            return null;
        }
        BinaryTreeNode temp = new BinaryTreeNode();
        temp.left = node.left;
        node.left = node.right;
        node.right = temp.left;
        invert(node.left);
        invert(node.right);
        return node;
    }
}
