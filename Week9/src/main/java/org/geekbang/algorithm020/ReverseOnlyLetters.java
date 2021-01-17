package org.geekbang.algorithm020;

import java.util.Stack;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(stack.pop());
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
