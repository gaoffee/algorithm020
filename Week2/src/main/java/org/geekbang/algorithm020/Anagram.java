package org.geekbang.algorithm020;

public class Anagram {

    public boolean valid(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars = new char[26];
        for (int i = 0; i < s1.length(); i++) {
            chars[s1.charAt(i) - 'a']++;
            chars[s2.charAt(i) - 'a']--;
        }
        for (char aChar : chars) {
            if (aChar != 0) {
                return false;
            }
        }
        return true;
    }
}
