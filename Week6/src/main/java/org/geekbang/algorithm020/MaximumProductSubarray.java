package org.geekbang.algorithm020;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        int result = 0;
        int max = 1;
        int min = 1;

        for (int num : nums) {
            // 反转
            if (num < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max * num, num);
            // 记录下最小值, 当可能出现负负为正的时候进行反转
            min = Math.min(min * num, num);
            result = Math.max(result, max);
        }
        return result;
    }
}
