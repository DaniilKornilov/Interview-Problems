package net.leetcode.linked_list;

//https://leetcode.com/problems/remove-linked-list-elements/

public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        for (int i = 1; i < 8; i++) {
            head.insertToList(i);
        }
        head.insertToList(6);
        ListNodeUtils.print(removeElements(head, 6));
    }
}
