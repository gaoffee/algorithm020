package org.geekbang.algorithm020;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strings) {
            final char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newOne = new String(chars);
            List<String> group = groups.computeIfAbsent(newOne, k -> new ArrayList<>());
            group.add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
