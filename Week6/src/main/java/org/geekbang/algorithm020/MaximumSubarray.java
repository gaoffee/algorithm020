package org.geekbang.algorithm020;

import java.util.Arrays;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums.length <= 0) {
            return 0;
        }
        // 子数组划至nums[i]时, 子数组元素最大和
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            // 状态转移方程
            // dp[i - 1] >= 0, 累加nums[i]
            // dp[i - 1] < 0, 则抛弃, 另起炉灶
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        Arrays.sort(dp);
        return dp[dp.length - 1];
    }
}
