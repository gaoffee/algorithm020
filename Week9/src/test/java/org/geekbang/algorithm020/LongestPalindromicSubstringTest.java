package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromicSubstringTest {

    @Test
    public void test() {
        assertThat(new LongestPalindromicSubstring().longestPalindrome("a")).isEqualTo("a");
        assertThat(new LongestPalindromicSubstring().longestPalindrome("ac")).isEqualTo("a");
        assertThat(new LongestPalindromicSubstring().longestPalindrome("cbbd")).isEqualTo("bb");
        assertThat(new LongestPalindromicSubstring().longestPalindrome("babad")).isEqualTo("bab");
    }
}