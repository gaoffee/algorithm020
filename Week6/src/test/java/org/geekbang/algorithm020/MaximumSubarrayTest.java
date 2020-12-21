package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSubarrayTest {

    @Test
    public void max_sub_array() {
        assertThat(new MaximumSubarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
    }
}