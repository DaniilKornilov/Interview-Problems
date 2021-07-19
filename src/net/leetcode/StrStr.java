package net.leetcode;

//https://leetcode.com/problems/implement-strstr/

public class StrStr {
    public static int strStr(String haystack, String needle) {
        int nl = needle.length();
        if (nl == 0) {
            return 0;
        }
        int hl = haystack.length();
        if (hl < nl) {
            return -1;
        }
        for (int i = 0; i < hl; i++) {
            for (int j = 0; j < nl; j++) {
                if (hl - i < nl) {
                    return -1;
                }
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == nl - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    //using substring
    public static int strStr1(String haystack, String needle) {
        int nl = needle.length();
        if (nl == 0) {
            return 0;
        }
        int hl = haystack.length();
        if (hl < nl) {
            return -1;
        }
        for (int i = 0; i < hl; i++) {
            if (i + nl > haystack.length()) {
                return -1;
            }
            if (haystack.substring(i, i + nl).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr1("mississippi", "issip"));
    }
}
