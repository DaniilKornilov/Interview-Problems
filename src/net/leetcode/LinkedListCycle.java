package net.leetcode;

//https://leetcode.com/problems/linked-list-cycle/

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        for (int i = 0; i < 8; i++) {
            head.insertToList(i);
        }
        System.out.println(hasCycle(head));
    }
}
