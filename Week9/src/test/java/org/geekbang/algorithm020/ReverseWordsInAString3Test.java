package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordsInAString3Test {

    @Test
    public void test() {
        assertThat(new ReverseWordsInAString3().reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }
}