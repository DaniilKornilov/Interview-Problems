package net.leetcode.string;

//https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    //hashmap
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            Character chS = s.charAt(i);
            Character chT = t.charAt(i);
            mapS.put(chS, mapS.getOrDefault(chS, 0) + 1);
            mapT.put(chT, mapT.getOrDefault(chT, 0) + 1);
        }

        return mapS.equals(mapT);
    }

    //sort
    public static boolean isAnagram1(String s, String t) {
        char[] tempArray1 = s.toCharArray();
        char[] tempArray2 = t.toCharArray();
        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);
        return Arrays.equals(tempArray1, tempArray2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram1("anagram", "nagaram"));
    }
}
