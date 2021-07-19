package net.leetcode.linked_list;

import java.math.BigInteger;

//https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode num1 = reverseList(l1);
        ListNode num2 = reverseList(l2);
        BigInteger res = listToBigInteger(num1).add(listToBigInteger(num2));
        return bigIntegerToList(res);
    }

    public static ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static BigInteger listToBigInteger(ListNode node) {
        BigInteger result = BigInteger.valueOf(0);
        while (node != null) {
            result = result.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(node.val));
            node = node.next;
        }
        return result;
    }

    public static void addToList(ListNode head, int value) {
        ListNode end = new ListNode(value);
        ListNode n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public static ListNode bigIntegerToList(BigInteger num) {
        String number = String.valueOf(num);
        int nl = number.length();
        ListNode listNode = new ListNode(Character.digit(number.charAt(nl - 1), 10));
        for (int i = nl - 2; i >= 0; i--) {
            int digit = Character.digit(number.charAt(i), 10);
            addToList(listNode, digit);
        }
        return listNode;
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(9);
        ListNode head2 = new ListNode(1);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        head2.insertToList(9);
        System.out.println("List 1:");
        ListNodeUtils.print(head1);
        System.out.println("List 2:");
        ListNodeUtils.print(head2);
        System.out.println("Result:");
        ListNode head3 = addTwoNumbers(head1, head2);
        ListNodeUtils.print(head3);
    }
}
