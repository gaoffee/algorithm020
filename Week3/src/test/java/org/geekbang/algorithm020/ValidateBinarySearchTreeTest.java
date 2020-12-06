package org.geekbang.algorithm020;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateBinarySearchTreeTest {

    @Test
    public void validate() {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);

        assertThat(new ValidateBinarySearchTree().validate(root, new ArrayList<Integer>())).isTrue();
    }
}