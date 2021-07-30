package net.leetcode.linked_list;

//https://leetcode.com/problems/delete-node-in-a-linked-list/

public class DeleteNodeInALinkedList {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        for (int i = 0; i < 8; i++) {
            head.insertToList(i);
        }
        deleteNode(head.next);
        ListNodeUtils.print(head);
    }
}
