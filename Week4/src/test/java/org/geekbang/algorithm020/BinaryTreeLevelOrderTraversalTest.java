package org.geekbang.algorithm020;


import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void level_order() {
        BinaryTreeNode _3 = new BinaryTreeNode(3);
        BinaryTreeNode _9 = new BinaryTreeNode(9);
        BinaryTreeNode _20 = new BinaryTreeNode(20);
        BinaryTreeNode _15 = new BinaryTreeNode(15);
        BinaryTreeNode _7 = new BinaryTreeNode(7);

        _3.left = _9;
        _3.right = _20;

        _20.left = _15;
        _20.right = _7;

        final List<List<Integer>> result = new BinaryTreeLevelOrderTraversal().levelOrder(_3);

        assertThat(result.get(0)).containsSequence(3);
        assertThat(result.get(1)).containsSequence(9, 20);
        assertThat(result.get(2)).containsSequence(15, 7);
    }
}