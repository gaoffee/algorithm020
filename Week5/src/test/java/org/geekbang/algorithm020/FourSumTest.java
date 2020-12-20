package org.geekbang.algorithm020;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.geekbang.algorithm020.FourSum.of;


public class FourSumTest {

    @Test
    public void two_sum() {
        final List<List<Integer>> result = new FourSum().twoSum(new int[]{2, 7, 11, 15}, 0, 9);
        assertThat(result).hasSize(1);
        assertThat(result).contains(of(2, 7));
    }

    @Test
    public void three_sum() {
        final List<List<Integer>> result = new FourSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}, 0, 0);

        assertThat(result).hasSize(2);
        assertThat(result).contains(of(-1, 0, 1));
        assertThat(result).contains(of(-1, -1, 2));
    }

    @Test
    public void four_sum() {
        final List<List<Integer>> result = new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertThat(result).hasSize(3);
    }
}