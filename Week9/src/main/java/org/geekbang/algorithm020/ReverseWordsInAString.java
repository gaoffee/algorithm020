package org.geekbang.algorithm020;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);
            if (builder.length() > 0 && c == ' ') {
                deque.offerFirst(builder.toString());
                builder.setLength(0);
            } else if (c != ' ') {
                builder.append(c);
            }
            left++;
        }
        deque.offerFirst(builder.toString());
        return String.join(" ", deque);
    }
}
