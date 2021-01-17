package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseOnlyLettersTest {

    @Test
    public void test() {
        assertThat(new ReverseOnlyLetters().reverseOnlyLetters("ab-cd")).isEqualTo("dc-ba");
        assertThat(new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj")).isEqualTo("j-Ih-gfE-dCba");
        assertThat(new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!")).isEqualTo("Qedo1ct-eeLg=ntse-T!");
    }
}