package org.geekbang.algorithm020;

public class ReverseList {

    private Node reverse(Node current, Node previous) {
        if (current == null) {
            return previous;
        }
        Node node = reverse(current.next, current);
        current.next = previous;
        return node;
    }

    public Node reverse(Node current) {
        return reverse(current, null);
    }
}
