package com.lily.leetcode.medium_list;

import java.util.List;

public class sortedListToBST {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }

    public static TreeNode sortedListToBST(ListNode head){
        if (head == null) return null;
        return toBST(head, null);
    }

    public static TreeNode toBST(ListNode head, ListNode tail){
        ListNode slow = head;
        ListNode fast = head;
        if (head == tail ) return null;
        //找到根节点，即链表中间元素
        while (fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        //根节点是slow.data
        TreeNode thead = new TreeNode(slow.data);
        //head~slow为根左子树，slow.next~tail为根的右子树
        thead.left = toBST(head, slow);
        thead.right = toBST(slow.next, tail);
        return thead;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-10);
        ListNode node2 = new ListNode(-3);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        TreeNode head = new TreeNode(0);
        head = sortedListToBST(node1);
        System.out.println(head.data+" "+head.left.data+" " + head.right.data+" " + head.left.left.data+ " " + head.left.right+" "+ head.right.left.data+" ");
    }
//    public static TreeNode sortedListToBST(ListNode head){
//        if (head == null) return null;
//        if (head.next == null) return new TreeNode(head.data);
//        ListNode slow = head, pre = null, fast = head;
//        while (fast != null && fast.next !=null){
//            pre = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        pre.next = null;
//        TreeNode n = new TreeNode(slow.data);
//        n.left = sortedListToBST(head);
//        n.right = sortedListToBST(slow.next);
//        return n;
//    }
}
