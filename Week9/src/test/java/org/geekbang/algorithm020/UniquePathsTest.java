package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UniquePathsTest {

    @Test
    public void test() {
        assertThat(new UniquePaths().uniquePaths(3, 7)).isEqualTo(28);
        assertThat(new UniquePaths().uniquePaths(3, 2)).isEqualTo(3);
        assertThat(new UniquePaths().uniquePaths(3, 2)).isEqualTo(3);
        assertThat(new UniquePaths().uniquePaths(7, 3)).isEqualTo(28);
        assertThat(new UniquePaths().uniquePaths(3, 3)).isEqualTo(6);
    }
}