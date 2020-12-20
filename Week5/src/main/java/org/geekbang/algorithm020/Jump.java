package org.geekbang.algorithm020;

import java.util.Arrays;

public class Jump {

    public int jump(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, n);
        result[0] = 0;
        for (int i = 1, j = 0; i < n; i++) {
            while (j < n && j + nums[j] < i) {
                j++;
            }
            result[i] = result[j] + 1;

        }
        return result[n - 1];
    }
}
