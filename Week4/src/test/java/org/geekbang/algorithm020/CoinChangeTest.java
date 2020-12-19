package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CoinChangeTest {

    @Test
    public void change() {
        assertThat(new CoinChange().change(new int[]{1, 2, 5}, 11)).isEqualTo(3);
        assertThat(new CoinChange().change(new int[]{2}, 3)).isEqualTo(-1);
        assertThat(new CoinChange().change(new int[]{1}, 0)).isEqualTo(0);
        assertThat(new CoinChange().change(new int[]{1}, 1)).isEqualTo(1);
        assertThat(new CoinChange().change(new int[]{1}, 2)).isEqualTo(2);
    }
}