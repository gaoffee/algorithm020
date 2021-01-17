package org.geekbang.algorithm020;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString3 {

    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        final char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                words.add(word.reverse().toString());
                word.setLength(0);
            } else {
                word.append(c);
            }
        }
        words.add(word.reverse().toString());
        return String.join(" ", words);
    }
}
