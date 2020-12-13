package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void should_find() {
        assertThat(new FindMinimumInRotatedSortedArray().find(new int[]{3, 4, 5, 1, 2})).isEqualTo(1);
        assertThat(new FindMinimumInRotatedSortedArray().find(new int[]{4, 5, 6, 7, 0, 1, 2})).isEqualTo(0);
        assertThat(new FindMinimumInRotatedSortedArray().find(new int[]{1})).isEqualTo(1);
    }
}