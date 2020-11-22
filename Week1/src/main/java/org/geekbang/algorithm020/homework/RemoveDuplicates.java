package org.geekbang.algorithm020.homework;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveDuplicates {

    public int remove(int[] nums) {
        if (ArrayUtils.isEmpty(nums)) {
            return 0;
        }
        int p = 0;
        int q = p + 1;
        while (q < nums.length) {
            // 比较首尾指针值是否相等
            if (nums[p] != nums[q]) {
                // 向前复制
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
