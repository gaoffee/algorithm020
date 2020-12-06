package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvertBinaryTreeTest {

    @Test
    public void should_invert() {
        BinaryTreeNode root = new BinaryTreeNode(2);
        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);
        assertThat(new MaxDepth().depth(root)).isEqualTo(2);

        root.right.right = new BinaryTreeNode(4);
        assertThat(new MaxDepth().depth(root)).isEqualTo(3);
    }
}