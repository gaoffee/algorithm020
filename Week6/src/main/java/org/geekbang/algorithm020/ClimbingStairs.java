package org.geekbang.algorithm020;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= dp.length; i++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[n];
    }
}
