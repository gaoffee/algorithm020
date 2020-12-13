package org.geekbang.algorithm020;

import java.util.Arrays;

public class AssignCookies {

    public int assign(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);
        int result = 0;
        int index = cookies.length - 1;
        for (int i = children.length - 1; i >= 0; i--) {
            if (index >= 0 && cookies[index] >= children[i]) {
                result++;
                index--;
            }
        }
        return result;
    }
}
