package cn.lily.leetcode.linkedlist;

/**
 * 判断链表是否有环，利用快慢指针，若快慢指针相遇，则有环
 */
public class LinkedListCycle {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }

    public static boolean hasCycle(ListNode head){
        ListNode walk = head;
        ListNode run = head;
        while (walk!= null && walk.next!=null && run != null && run.next !=null){
            walk = walk.next;
            run = run.next.next;
            if (walk == run)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        boolean res = hasCycle(node1);
        System.out.println(res);
    }
}
