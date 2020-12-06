package org.geekbang.algorithm020;

public class ClimbStairs {

    public int climb(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climb(n - 1) + climb(n - 2);
    }
}
