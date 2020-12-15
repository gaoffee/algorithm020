package org.geekbang.algorithm020;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseListTest {

    @Test
    public void reverse() {
        Node _1 = new Node(1);
        Node _2 = new Node(2);
        Node _3 = new Node(3);
        Node _4 = new Node(4);

        _1.next = _2;
        _2.next = _3;
        _3.next = _4;
        _4.next = null;

        final Node node = new ReverseList().reverse(_1);
        assertThat(node.value).isEqualTo(4);
        assertThat(node.next.value).isEqualTo(3);
        assertThat(node.next.next.value).isEqualTo(2);
        assertThat(node.next.next.next.value).isEqualTo(1);
    }
}