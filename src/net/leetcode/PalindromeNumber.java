package net.leetcode;

//https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int res = 0;
        int temp = x;
        while (temp != 0) {
            res = res * 10 + temp % 10;
            temp /= 10;
        }
        return res == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(9009));
    }
}
