package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOf1BitsTest {

    @Test
    public void test() {
        assertThat(new NumberOf1Bits().hammingWeight(0b00000000000000000000000000001011)).isEqualTo(3);
        assertThat(new NumberOf1Bits().hammingWeight(0b00000000000000000000000010000000)).isEqualTo(1);
        assertThat(new NumberOf1Bits().hammingWeight(0b11111111111111111111111111111101)).isEqualTo(31);
    }
}