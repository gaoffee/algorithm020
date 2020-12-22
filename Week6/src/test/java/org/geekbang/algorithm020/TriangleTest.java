package org.geekbang.algorithm020;


import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void minimum_total() {
        final List<List<Integer>> triangle = Lists.newArrayList(
                Lists.newArrayList(2),
                Lists.newArrayList(3, 4),
                Lists.newArrayList(6, 5, 7),
                Lists.newArrayList(4, 1, 8, 3)
        );

        assertThat(new Triangle().minimumTotal(triangle)).isEqualTo(11);
        assertThat(new Triangle().minimumTotal_(triangle)).isEqualTo(11);
    }
}