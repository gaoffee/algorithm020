package org.geekbang.algorithm020;

public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        if (num == 0) {
            return result;
        }
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            // 状态转移方程
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
