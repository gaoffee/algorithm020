package org.geekbang.algorithm020;

public class BinaryTreeNode {
    public Integer val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    BinaryTreeNode(Integer val) {
        this.val = val;
    }

    BinaryTreeNode(Integer val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
