package org.geekbang.algorithm020;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public int[] topK(int[] nums, int k) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        for (int num : nums) {
            if (numberCount.containsKey(num)) {
                numberCount.put(num, numberCount.get(num) + 1);
            } else {
                numberCount.put(num, 1);
            }
        }
        PriorityQueue<Top> heap = new PriorityQueue<>((t1, t2) -> t2.count.compareTo(t1.count));
        numberCount.forEach((key, value) -> heap.add(new Top(key, value)));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.remove().value;
        }
        return result;
    }
}
