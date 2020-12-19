package org.geekbang.algorithm020;

public class Fibonacci {

    public int simple(int i) {
        if (i <= 1) {
            return i;
        }
        return simple(i - 1) + simple(i - 2);
    }

    public int note(int i, int[] cache) {
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
        int[] bp = new int[i + 1];
        bp[0] = bp[1] = 0;
        for (int j = 2; j < bp.length; j++) {
            bp[j] = bp(j - 1) + bp(j - 2);
        }
        return bp[i];
    }
}
