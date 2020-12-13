package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssignCookiesTest {

    @Test
    public void should_assign() {
        assertThat(new AssignCookies().assign(new int[]{1, 2, 3}, new int[]{1, 1})).isEqualTo(1);
        assertThat(new AssignCookies().assign(new int[]{1, 2}, new int[]{1, 2, 3})).isEqualTo(2);
    }
}