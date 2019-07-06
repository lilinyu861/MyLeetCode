//package com.lily.leetcode.medium_hashtable;
///**
// * Given a binary tree, return the inorder traversal of its nodes' values.
// *
// * Example:
// *
// * Input: [1,null,2,3]
// *    1
// *     \
// *      2
// *     /
// *    3
// *
// * Output: [1,3,2]
// */
//
//import java.util.ArrayList;
//import java.util.List;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
//public class BinaryTreeInorderTraversal  {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        visited(root, result);
//        return result;
//    }
//
//    public void visited(TreeNode root, List<Integer> result){
//        if (root != null){
//            if (root.left != null){
//                visited(root.left, result);
//            }
//            result.add(root.val);
//            if (root.right != null){
//                visited(root.right, result);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String root = "[1,null,2,3]";
//        List<Integer> result = new BinaryTreeInorderTraversal().inorderTraversal(root);
//        System.out.println(result);
//    }
//
//}
//
