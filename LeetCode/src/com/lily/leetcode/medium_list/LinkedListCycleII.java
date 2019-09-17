package com.lily.leetcode.medium_list;
/**
 * 若链表有环，则返回环的起始点，若链表么有环，则返回null
 * 使用hashSet的方式计算
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycleII {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head){
        Set<ListNode> visited = new HashSet<>();
        ListNode node = head;
        while (node != null){
            if (visited.contains(node)){
                return node;
            }
            visited.add(node);
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        ListNode head = new ListNode(0);
        head = detectCycle(node1);
        System.out.println(head.val);
    }
}
