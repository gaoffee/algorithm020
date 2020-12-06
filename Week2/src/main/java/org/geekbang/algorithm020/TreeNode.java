package org.geekbang.algorithm020;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TreeNode {
    public Integer val;
    public List<TreeNode> children;

    public TreeNode(Integer val, TreeNode... nodes) {
        this.val = val;
        this.children = nodes != null ? Arrays.asList(nodes) : Collections.emptyList();
    }
}
