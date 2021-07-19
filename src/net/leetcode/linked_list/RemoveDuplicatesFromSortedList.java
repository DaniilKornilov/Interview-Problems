package net.leetcode.linked_list;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.val == prev.next.val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        for (int i = 0; i < 8; i++) {
            head.insertToList(i);
        }
        ListNodeUtils.print(deleteDuplicates(head));
    }
}
