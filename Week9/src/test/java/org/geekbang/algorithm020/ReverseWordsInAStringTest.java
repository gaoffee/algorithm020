package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordsInAStringTest {

    @Test
    public void test() {
        assertThat(new ReverseWordsInAString().reverseWords("the sky is blue")).isEqualTo("blue is sky the");
        assertThat(new ReverseWordsInAString().reverseWords("  hello world!  ")).isEqualTo("world! hello");
        assertThat(new ReverseWordsInAString().reverseWords("a good   example")).isEqualTo("example good a");
        assertThat(new ReverseWordsInAString().reverseWords("  Bob    Loves  Alice   ")).isEqualTo("Alice Loves Bob");
        assertThat(new ReverseWordsInAString().reverseWords("Alice does not even like bob")).isEqualTo("bob like even not does Alice");
    }
}