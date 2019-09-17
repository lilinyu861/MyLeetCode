package cn.lily.leetcode.linkedlist;
/**
 * 链表逆序
 */
public class ListReverse {
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public static ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode head = new ListNode(0);
        head = reverse(node1);
        System.out.println(head.data+" "+head.next.data+" "+head.next.next.data);
    }
}
