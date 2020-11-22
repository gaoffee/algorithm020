package org.geekbang.algorithm020.homework;

import org.junit.Test;

import static org.geekbang.algorithm020.homework.MergeTwoSortedLists.of;

public class MergeTwoSortedListsTest {

    @Test
    public void should_merge_two_sorted_lists() {
        new MergeTwoSortedLists().merge(of(1, 2, 4), of(1, 3, 4));
    }
}