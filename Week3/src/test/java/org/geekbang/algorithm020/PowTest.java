package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PowTest {

    @Test
    public void should_pow() {
        assertThat(new Pow().pow(0d, 1)).isEqualTo(0d);
        assertThat(new Pow().pow(2d, 0)).isEqualTo(1d);
        assertThat(new Pow().pow(2d, 2)).isEqualTo(4d);
        assertThat(new Pow().pow(2d, -2)).isEqualTo(0.25d);
    }
}