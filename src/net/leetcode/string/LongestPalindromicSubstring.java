package net.leetcode.string;

//https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int length = s.length();

        if (length == 1) {
            return s;
        }

        int l = 0;
        int r = 0;

        for (int i = 0; i < length; i++) {
            int pLen = Math.max(expandFromCenter(s, i, i), expandFromCenter(s, i, i + 1));
            if (pLen > r - l) {
                l = i - (pLen - 1) / 2;
                r = i + pLen / 2;
            }
        }
        return s.substring(l, r + 1);
    }

    public static int expandFromCenter(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println("racecar");
        System.out.println("bd");
    }
}
