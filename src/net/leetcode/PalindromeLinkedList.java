package net.leetcode;

//https://leetcode.com/problems/palindrome-linked-list/

import java.util.Stack;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (temp != null) {
            if (stack.pop() != temp.val) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.insertToList(2);
        head.insertToList(2);
        head.insertToList(1);
        System.out.println(isPalindrome(head));
    }
}
