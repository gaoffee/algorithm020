package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumProductSubarrayTest {

    @Test
    public void max_product() {
        assertThat(new MaximumProductSubarray().maxProduct(new int[]{2, 3, -2, 4})).isEqualTo(6);
        assertThat(new MaximumProductSubarray().maxProduct(new int[]{-2, 3, -4})).isEqualTo(24);
    }
}