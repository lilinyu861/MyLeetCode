package com.lily.leetcode.easy_array;

import javax.print.DocFlavor;
import java.util.List;

public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        int value = 0;
        int carry = 0;
        while(l1 != null && l2 != null){
            value = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val + carry)/10;

            temp.next = new ListNode(value);
            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;

            if(l1 == null && l2 == null){
                break;
            }
            if(l1 == null){
                l1 = new ListNode(0);
            }
            if(l2 == null){
                l2 = new ListNode(0);
            }
        }
        if(carry != 0)
            temp.next = new ListNode(carry);
        return result.next;
    }

}
