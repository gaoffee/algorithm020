package org.geekbang.algorithm020;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (coins.length <= 0 || amount <= 0) {
            return 0;
        }
        // dp数组代表凑出金额i需要的硬币数
        int[] dp = new int[amount + 1];
        // amount + 1 相当于无穷大
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if (i < coin) {
                    continue;
                }
                // 状态转移方程
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
