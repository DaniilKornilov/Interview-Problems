package net.leetcode.linked_list;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode listNode) {
        this.val = listNode.val;
        this.next = listNode.next;
    }

    public void insertToList(int value) {
        ListNode end = new ListNode(value);
        ListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }
}
