package net.leetcode;

public class ListNodeUtils {
    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
