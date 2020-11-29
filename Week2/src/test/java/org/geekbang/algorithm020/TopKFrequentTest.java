package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TopKFrequentTest {

    @Test
    public void should_get_top_k() {
        assertThat(new TopKFrequent().topK(new int[]{1, 1, 1, 2, 2, 3}, 2)).containsOnly(1, 2);
        assertThat(new TopKFrequent().topK(new int[]{1, 1, 1, 2, 2, 3}, 1)).containsOnly(1);
        assertThat(new TopKFrequent().topK(new int[]{1}, 1)).containsOnly(1);
    }
}