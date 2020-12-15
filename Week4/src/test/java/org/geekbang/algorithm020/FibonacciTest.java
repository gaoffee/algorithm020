package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FibonacciTest {

    @Test
    public void simple_fibonacci() {
        assertThat(new Fibonacci().simple(0)).isEqualTo(0);
        assertThat(new Fibonacci().simple(1)).isEqualTo(1);
        assertThat(new Fibonacci().simple(2)).isEqualTo(1);
        assertThat(new Fibonacci().simple(3)).isEqualTo(2);
    }

    @Test
    public void advanced_fibonacci() {
        assertThat(new Fibonacci().advanced(0, new int[1])).isEqualTo(0);
        assertThat(new Fibonacci().advanced(1, new int[2])).isEqualTo(1);
        assertThat(new Fibonacci().advanced(2, new int[3])).isEqualTo(1);
        assertThat(new Fibonacci().advanced(3, new int[4])).isEqualTo(2);
    }

    @Test
    public void bp() {
        assertThat(new Fibonacci().bp(0)).isEqualTo(0);
        assertThat(new Fibonacci().bp(1)).isEqualTo(1);
        assertThat(new Fibonacci().bp(2)).isEqualTo(1);
        assertThat(new Fibonacci().bp(3)).isEqualTo(2);
    }
}