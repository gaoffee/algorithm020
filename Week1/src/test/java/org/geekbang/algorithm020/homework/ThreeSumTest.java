package org.geekbang.algorithm020.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    @Test
    public void three_sum_should_eq_zero() {
        final List<List<Integer>> result = new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        Assert.assertEquals(result.size(), 2);
        Assert.assertEquals(result.get(0).stream().reduce(0, Integer::sum), Integer.valueOf(0));
        Assert.assertEquals(result.get(1).stream().reduce(0, Integer::sum), Integer.valueOf(0));
    }
}