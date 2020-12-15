package org.geekbang.algorithm020;

public class Fibonacci {

    public int simple(int i) {
        if (i <= 1) {
            return i;
        }
        return simple(i - 1) + simple(i - 2);
    }

    public int advanced(int i, int[] cache) {
        if (i <= 1) {
            return i;
        }
        if (cache[i] == 0) {
            cache[i] = simple(i - 1) + simple(i - 2);
        }
        return cache[i];
    }

    public int bp(int i) {
        if (i <= 1) {
            return i;
        }
        int[] result = new int[i + 1];
        result[0] = 0;
        result[1] = 1;
        for (int j = 2; j <= i; j++) {
            result[j] = result[j - 1] + result[j - 2];
        }
        return result[i];
    }
}
