package org.geekbang.algorithm020;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 1) {
            return s;
        }
        boolean[][] dp = new boolean[length][length];
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        int start = 0;
        int longest = 1;
        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                if (chars[i] != chars[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - 1 < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && (j - i + 1) > longest) {
                    longest = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + longest);
    }
}
