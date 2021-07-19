package net.leetcode.string;

//https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = result.length();
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(l - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
