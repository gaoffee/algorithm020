package org.geekbang.algorithm020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }
        dfs("", n, n, result);
        return result;
    }

    private void dfs(String string, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(string);
            return;
        }

        if (left > right) {
            return;
        }

        if (left > 0) {
            dfs(string + "(", left - 1, right, result);
        }

        if (right > 0) {
            dfs(string + ")", left, right - 1, result);
        }
    }
}
