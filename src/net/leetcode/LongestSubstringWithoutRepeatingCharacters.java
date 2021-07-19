package net.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int i = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < len; j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                max = Math.max(max, j - i);
                i = Math.max(i, map.get(c) + 1);
            }
            map.put(c, j);
        }
        return Math.max(max, len - i);
    }

    public static int lengthOfLongestSubstring1(String s) {
        int len = s.length();
        int i = 0;
        int max = 0;
        int[] arr = new int[128];
        Arrays.fill(arr, -1);
        for (int j = 0; j < len; j++) {
            char c = s.charAt(j);
            if (arr[c] != -1) {
                max = Math.max(max, j - i);
                i = Math.max(i, arr[c] + 1);
            }
            arr[c] = j;
        }
        return Math.max(max, len - i);
    }

    public static int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        int i = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        for (int j = 0; j < len; j++) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring1(" "));
        System.out.println(lengthOfLongestSubstring2("dvdf"));
    }
}
