package org.geekbang.algorithm020.homework;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {

    static class ListNode {
        int value;

        ListNode previous;

        ListNode next;

        ListNode() {
        }

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        void setPrevious(ListNode previous) {
            this.previous = previous;
        }

        void setNext(ListNode next) {
            this.next = next;
        }

        int[] items() {
            List<Integer> items = new LinkedList<>();
            ListNode current = this;
            while (current.next != null) {
                items.add(current.next.value);
                current = current.next;
            }
            int[] result = new int[items.size()];
            for (int i = 0; i < items.size(); i++) {
                result[i] = items.get(i);
            }
            return result;
        }
    }

    public static ListNode of(int... nums) {
        ListNode last = new ListNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            final ListNode current = new ListNode(nums[i]);
            current.setPrevious(last);
            last.setNext(current);
            last = current;
        }
        return last;
    }

    public ListNode merge(ListNode n1, ListNode n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }
        if (n1.value < n2.value) {
            n1.next = merge(n1.next, n2);
            return n1;
        } else {
            n2.next = merge(n1, n2.next);
            return n2;
        }
    }
}
