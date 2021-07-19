package net.leetcode.string;

//https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {

    public static int shortestWord(String[] strings) {
        int res = Integer.MAX_VALUE;
        for (String string : strings) {
            int current = string.length();
            if (res > current) {
                res = current;
            }
        }
        return res;
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int shortestWord = shortestWord(strs);
        for (int i = 0; i < shortestWord; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (ch == strs[j].charAt(i)) {
                    if (j == strs.length - 1) {
                        res.append(ch);
                    }
                } else {
                    return res.toString();
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
