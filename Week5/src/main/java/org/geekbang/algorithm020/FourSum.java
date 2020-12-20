package org.geekbang.algorithm020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        final int n = nums.length;
        for (int i = 0; i < n; i++) {
            List<List<Integer>> resultOfThreeSum = threeSum(nums, i + 1, target - nums[i]);
            for (List<Integer> item : resultOfThreeSum) {
                item.add(nums[i]);
                result.add(item);
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] nums, int start, int target) {
        Arrays.sort(nums);
        final int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = start; i < n; i++) {
            final List<List<Integer>> resultOfTwoSum = twoSum(nums, i + 1, target - nums[i]);
            for (List<Integer> item : resultOfTwoSum) {
                item.add(nums[i]);
                result.add(item);
            }
            while (i < n - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }

    public List<List<Integer>> twoSum(int[] nums, int start, int target) {
        Arrays.sort(nums);
        final int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int low = start, high = n - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            int left = nums[low], right = nums[high];
            if (sum < target) {
                while (low < high && nums[low] == left) {
                    low++;
                }
            } else if (sum > target) {
                while (low < high && nums[high] == right) {
                    high--;
                }
            } else {
                result.add(of(left, right));
                while (low < high && nums[low] == left) {
                    low++;
                }
                while (low < high && nums[high] == right) {
                    high--;
                }
            }
        }
        return result;
    }

    public static List<Integer> of(Integer... items) {
        List<Integer> result = new ArrayList<>(items.length);
        result.addAll(Arrays.asList(items));
        return result;
    }
}
