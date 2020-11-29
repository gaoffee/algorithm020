package org.geekbang.algorithm020;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void should_group_anagrams() {
        final List<List<String>> groups = new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(groups.size(), 3);
    }
}