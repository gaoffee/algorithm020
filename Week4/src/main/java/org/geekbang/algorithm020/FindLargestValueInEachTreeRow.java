package org.geekbang.algorithm020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {

    public List<Integer> find(BinaryTreeNode root) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int max = -1;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                final BinaryTreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
