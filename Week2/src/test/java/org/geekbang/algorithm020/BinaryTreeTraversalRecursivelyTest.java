package org.geekbang.algorithm020;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class BinaryTreeTraversalRecursivelyTest {

    @Test
    public void do_preorder_traversal() {
        List<Integer> result = new ArrayList<>();
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);

        node2.left = new BinaryTreeNode(3);
        root.right = node2;

        new BinaryTreeTraversalRecursively().preorderTraversal(root, result);
        assertThat(result).containsSequence(1, 2, 3);
    }

    @Test
    public void do_inorder_traversal() {
        List<Integer> result = new ArrayList<>();
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);

        node2.left = new BinaryTreeNode(3);
        root.right = node2;

        new BinaryTreeTraversalRecursively().inorderTraversal(root, result);
        assertThat(result).containsSequence(1, 3, 2);
    }

    @Test
    public void do_postorder_traversal() {
        List<Integer> result = new ArrayList<>();
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node2 = new BinaryTreeNode(2);

        node2.left = new BinaryTreeNode(3);
        root.right = node2;

        new BinaryTreeTraversalRecursively().postorderTraversal(root, result);
        assertThat(result).containsSequence(3, 2, 1);
    }
}