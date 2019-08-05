package com.lily.leetcode.medium_tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    private void visit(TreeNode root, List<Integer> result){
        if (root != null){
            if (root.left!= null)
                visit(root.left, result);
            result.add(root.val);
            if (root.right != null)
                visit(root.right, result);
        }
    }

//    public static void main(String[] args) {
//
//    }
}
