package org.geekbang.algorithm020;

public class Pow {

    public double pow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1.0D;
        }
        if (n < 0) {
            return 1 / helper(x, Math.abs(n));
        } else {
            return helper(x, n);
        }
    }

    private double helper(double x, int n) {
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            double temp = helper(x, n / 2);
            return temp * temp;
        } else {
            double temp = helper(x, n / 2);
            return temp * temp * 2;
        }
    }
}
