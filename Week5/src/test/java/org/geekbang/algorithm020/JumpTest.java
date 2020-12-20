package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JumpTest {

    @Test
    public void jump() {
        assertThat(new Jump().jump(new int[]{2, 3, 1, 1, 4})).isEqualTo(2);
    }
}