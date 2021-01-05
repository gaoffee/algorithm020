package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PowerOfTwoTest {

    @Test
    public void test() {
        assertThat(new PowerOfTwo().isPowerOfTwo(2)).isTrue();
        assertThat(new PowerOfTwo().isPowerOfTwo(16)).isTrue();
        assertThat(new PowerOfTwo().isPowerOfTwo(218)).isFalse();
    }
}