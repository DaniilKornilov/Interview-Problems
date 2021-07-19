package net.leetcode;

//https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists {
    public static ListNode recursiveMergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode result;
        if (l1.val < l2.val) {
            result = l1;
            l1.next = recursiveMergeTwoLists(l1.next, l2);
        } else {
            result = l2;
            l2.next = recursiveMergeTwoLists(l1, l2.next);
        }
        return result;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result;
        if (l1.val < l2.val) {
            result = l1;
            l1 = l1.next;
        } else {
            result = l2;
            l2 = l2.next;
        }
        ListNode current = result;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                current.next = l2;
                l2 = l2.next;
            } else {
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return result;
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(4);
        for (int i = 1; i < 8; i++) {
            head1.insertToList(i);
        }
        for (int i = 5; i < 10; i++) {
            head2.insertToList(i);
        }
        System.out.println("List 1:");
        ListNodeUtils.print(head1);
        System.out.println("List 2:");
        ListNodeUtils.print(head2);
        System.out.println("List 3.1:");
        ListNodeUtils.print(new ListNode(mergeTwoLists(head1, head2)));
        System.out.println("List 3.2:");
        ListNodeUtils.print(new ListNode(recursiveMergeTwoLists(head1, head2)));
    }
}
