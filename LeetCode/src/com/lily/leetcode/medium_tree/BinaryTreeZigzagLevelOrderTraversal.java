package com.lily.leetcode.medium_tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
/*
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return res;
        helper(root, 0);
        return res;
    }

    public void helper(TreeNode node, int level){
        if (res.size() == level) res.add(new ArrayList<>());
        if (level % 2 == 0) res.get(level).add(node.val);
        else res.get(level).add(0, node.val);
        if (node.left != null) helper(node.left, level+1);
        if (node.right != null) helper(node.right, level+1);
    }
    */
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null) return res;

    Queue<TreeNode> queue = new LinkedList<>();
    int level = 0;
    queue.add(root);
    while(!queue.isEmpty()){
        res.add(new LinkedList<Integer>());
        int level_len = queue.size();
        for (int i = 0; i < level_len; i++){
            TreeNode node = queue.remove();
            if (level%2 == 0) res.get(level).add(node.val);
            else res.get(level).add(0, node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        level++;
    }
    return res;
}
}

