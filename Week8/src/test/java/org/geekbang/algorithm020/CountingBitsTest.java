package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountingBitsTest {

    @Test
    public void test() {
        assertThat(new CountingBits().countBits(2)).containsSequence(0, 1, 1);
        assertThat(new CountingBits().countBits(5)).containsSequence(0, 1, 1, 2, 1, 2);
    }
}