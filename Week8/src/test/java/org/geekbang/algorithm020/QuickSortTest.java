package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    @Test
    public void test() {
        int[] array = new int[]{4, 5, 1, 7, 3, 9};
        new QuickSort().quickSort(array, 0, array.length - 1);
        assertThat(array).containsSequence(1, 3, 4, 5, 7, 9);
    }
}