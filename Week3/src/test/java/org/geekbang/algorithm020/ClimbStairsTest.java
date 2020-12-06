package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClimbStairsTest {

    @Test
    public void do_climb() {
        assertThat(new ClimbStairs().climb(1)).isEqualTo(1);
        assertThat(new ClimbStairs().climb(2)).isEqualTo(2);
        assertThat(new ClimbStairs().climb(3)).isEqualTo(3);
    }
}