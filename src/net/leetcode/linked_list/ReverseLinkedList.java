package net.leetcode.linked_list;

//https://leetcode.com/problems/reverse-linked-list/

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        for (int i = 1; i < 8; i++) {
            head.insertToList(i);
        }
        head.insertToList(6);
        ListNodeUtils.print(reverseList(head));
    }
}
