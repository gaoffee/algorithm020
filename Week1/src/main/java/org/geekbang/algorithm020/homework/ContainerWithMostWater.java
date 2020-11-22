package org.geekbang.algorithm020.homework;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int area = 0;
        // 双指针
        int i = 0, j = height.length - 1;
        while (i < j) {
            area = height[i] < height[j]
                    ? Math.max(area, (j - i) * height[i++])
                    : Math.max(area, (j - i) * height[j--]);
        }
        return area;
    }
}
