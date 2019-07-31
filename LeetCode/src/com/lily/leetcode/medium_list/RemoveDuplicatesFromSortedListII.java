package com.lily.leetcode.medium_list;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 *
 * Example 1:
 *
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * Example 2:
 *
 * Input: 1->1->1->2->3
 * Output: 2->3
 */

public class RemoveDuplicatesFromSortedListII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy, curr = head;
        dummy.next = head;
        while(curr != null){
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            if (pre.next == curr) pre = pre.next;
            else pre.next = curr.next;
            curr = curr.next;
        }
        return dummy.next;
    }
}