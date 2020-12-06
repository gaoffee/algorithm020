package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LowestCommonAncestorTest {

    @Test
    public void find() {
        BinaryTreeNode _3 = new BinaryTreeNode(3);
        BinaryTreeNode _5 = new BinaryTreeNode(5);
        BinaryTreeNode _1 = new BinaryTreeNode(1);
        BinaryTreeNode _6 = new BinaryTreeNode(6);
        BinaryTreeNode _2 = new BinaryTreeNode(2);
        BinaryTreeNode _0 = new BinaryTreeNode(0);
        BinaryTreeNode _8 = new BinaryTreeNode(8);
        BinaryTreeNode _7 = new BinaryTreeNode(7);
        BinaryTreeNode _4 = new BinaryTreeNode(4);

        _3.left = _5;
        _3.right = _1;

        _5.left = _6;
        _5.right = _2;

        _1.left = _0;
        _1.left = _8;

        _2.left = _7;
        _2.right = _4;

        assertThat(new LowestCommonAncestor().commonAncestor(_3, _5, _1).val).isEqualTo(3);
        assertThat(new LowestCommonAncestor().commonAncestor(_3, _5, _4).val).isEqualTo(5);
    }
}