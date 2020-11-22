package org.geekbang.algorithm020.homework;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void should_do_plus() {
        Assert.assertArrayEquals(new PlusOne().plus(new int[]{0}), new int[]{1});

        Assert.assertArrayEquals(new PlusOne().plus(new int[]{1, 2, 3}), new int[]{1, 2, 4});
        Assert.assertArrayEquals(new PlusOne().plus(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2, 2});

        Assert.assertArrayEquals(new PlusOne().plus(new int[]{9}), new int[]{1, 0});
        Assert.assertArrayEquals(new PlusOne().plus(new int[]{9, 9}), new int[]{1, 0, 0});
    }

}