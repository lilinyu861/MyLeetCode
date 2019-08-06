package com.lily.leetcode.medium_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    /*
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        helper(root, 0);
        return res;
    }

    public void helper(TreeNode node, int level){
        if (res.size() == level) res.add(new ArrayList<Integer>());
        res.get(level).add(node.val);
        if (node.left != null) helper(node.left, level+1);
        if (node.right != null) helper(node.right, level+1);
    }
    */

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            res.add(new ArrayList<Integer>());
            int level_len = queue.size();
            for (int i = 0; i < level_len; i++){
                TreeNode node = queue.remove();
                res.get(level).add(node.val);
                if (node.left!= null) queue.add(node.left);
                if (node.right!= null) queue.add(node.right);
            }
            level++;
        }
        return res;
    }
}
