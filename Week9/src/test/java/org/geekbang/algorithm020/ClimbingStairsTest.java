package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClimbingStairsTest {

    @Test
    public void test() {
        assertThat(new ClimbingStairs().climbStairs(2)).isEqualTo(2);
        assertThat(new ClimbingStairs().climbStairs(3)).isEqualTo(3);
    }
}