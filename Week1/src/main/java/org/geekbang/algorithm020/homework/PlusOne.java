package org.geekbang.algorithm020.homework;

public class PlusOne {

    public int[] plus(int[] nums) {
        // 特殊处理
        if (nums.length == 1 && nums[0] == 0) {
            return new int[]{1};
        }
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            nums[i]++;
            nums[i] %= 10;
            // 非9
            if (nums[i] != 0) {
                return nums;
            }
        }
        nums = new int[len + 1];
        nums[0] = 1;
        return nums;
    }
}
