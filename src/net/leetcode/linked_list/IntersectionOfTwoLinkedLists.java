package net.leetcode.linked_list;

//https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            if (pointerA == null) {
                pointerA = headB;
            } else {
                pointerA = pointerA.next;
            }
            if (pointerB == null) {
                pointerB = headA;
            } else {
                pointerB = pointerB.next;
            }
        }

        return pointerA;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        for (int i = 1; i < 8; i++) {
            head1.insertToList(i);
        }

        ListNode head2 = new ListNode(0);
        head2.insertToList(6);
        head2.next.next = head1.next.next.next;

        ListNodeUtils.print(getIntersectionNode(head1, head2));
    }
}
