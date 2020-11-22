package org.geekbang.algorithm020.homework;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void should_move_zeroes_if_has_no_zero() {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = new int[]{1, 1, 2, 3, 12};
        mz.moveZeroesWithTwiceLoop(nums);
        Assert.assertArrayEquals(nums, new int[]{1, 1, 2, 3, 12});

        nums = new int[]{1, 1, 2, 3, 12};
        mz.moveZeroesWithOnceLoop(nums);
        Assert.assertArrayEquals(nums, new int[]{1, 1, 2, 3, 12});
    }

    @Test
    public void should_move_zeroes_if_all_zero() {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = new int[]{0, 0, 0, 0, 0};
        mz.moveZeroesWithTwiceLoop(nums);
        Assert.assertArrayEquals(nums, new int[]{0, 0, 0, 0, 0});

        nums = new int[]{0, 0, 0, 0, 0};
        mz.moveZeroesWithOnceLoop(nums);
        Assert.assertArrayEquals(nums, new int[]{0, 0, 0, 0, 0});
    }

    @Test
    public void should_move_zeroes() {
        MoveZeroes mz = new MoveZeroes();
        int[] nums = new int[]{1, 0, 2, 0, 12};
        mz.moveZeroesWithTwiceLoop(nums);
        Assert.assertArrayEquals(nums, new int[]{1, 2, 12, 0, 0});

        nums = new int[]{1, 0, 2, 0, 12};
        mz.moveZeroesWithOnceLoop(nums);
        Assert.assertArrayEquals(nums, new int[]{1, 2, 12, 0, 0});
    }
}