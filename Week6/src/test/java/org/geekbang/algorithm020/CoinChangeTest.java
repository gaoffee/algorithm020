package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinChangeTest {

    @Test
    public void coin_change() {
        assertThat(new CoinChange().coinChange(new int[]{1, 5, 2}, 11)).isEqualTo(3);
    }
}