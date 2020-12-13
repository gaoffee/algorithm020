package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateParenthesisTest {


    @Test
    public void should_generate() {
        assertThat(new GenerateParenthesis().generate(3)).containsExactly("((()))", "(()())", "(())()", "()(())", "()()()");
    }
}