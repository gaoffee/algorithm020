package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumPathSumTest {

    @Test
    public void min_path_sum() {
        int[][] grid =
                {
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
                };
        int[][] grid2 =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        System.out.println(grid2[1][2]);
        assertThat(new MinimumPathSum().minPathSum(grid)).isEqualTo(7);
    }
}