package org.geekbang.algorithm020;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void is_valid() {
        assertTrue(new Anagram().valid("anagram", "nagaram"));
        assertFalse(new Anagram().valid("rat", "car"));
    }
}