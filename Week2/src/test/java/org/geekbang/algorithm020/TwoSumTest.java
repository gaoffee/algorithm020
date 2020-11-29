package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {

    @Test
    public void find() {
        final int[] ints = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertThat(ints).contains(0 ,1);
    }
}