package org.geekbang.algorithm020.homework;

import org.geekbang.algorithm020.homework.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    @Test
    public void should_work_out_max_Area() {
        final int value = new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assert.assertEquals(value, 49);
    }
}