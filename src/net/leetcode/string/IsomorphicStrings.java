package net.leetcode.string;

//https://leetcode.com/problems/isomorphic-strings/

import java.util.*;

public class IsomorphicStrings {
    private static Map<Character, List<Integer>> processString(String s) {
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (map.containsKey(character)) {
                map.get(character).add(i);
            } else {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i);
                map.put(character, list);
            }
        }
        return map;
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, List<Integer>> mapS = processString(s);
        Map<Character, List<Integer>> mapT = processString(t);
        if (mapS.size() != mapT.size()) {
            return false;
        }
        return new ArrayList<>(mapS.values()).
                equals(new ArrayList<>(mapT.values()));
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
}
