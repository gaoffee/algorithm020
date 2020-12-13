package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FindLargestValueInEachTreeRowTest {

    @Test
    public void should_find() {

        BinaryTreeNode _1 = new BinaryTreeNode(1);
        BinaryTreeNode __3 = new BinaryTreeNode(3);
        BinaryTreeNode __2 = new BinaryTreeNode(2);
        BinaryTreeNode ___5 = new BinaryTreeNode(5);
        BinaryTreeNode ___3 = new BinaryTreeNode(3);
        BinaryTreeNode ___9 = new BinaryTreeNode(9);

        _1.left = __3;
        _1.right = __2;

        __3.left = ___5;
        __3.right = ___3;

        __2.right = ___9;

        assertThat(new FindLargestValueInEachTreeRow().find(_1)).containsSequence(1, 3, 9);
    }
}