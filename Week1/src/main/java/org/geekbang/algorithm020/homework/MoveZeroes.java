package org.geekbang.algorithm020.homework;

public class MoveZeroes {

    public void moveZeroesWithTwiceLoop(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        // 赋值为0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesWithOnceLoop(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
