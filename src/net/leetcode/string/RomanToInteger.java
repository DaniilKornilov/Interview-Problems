package net.leetcode.string;

//https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {
    public static int valueOfRoman(char c) {
        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> -1;
        };
    }

    public static int romanToInt(String s) {
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int s1 = valueOfRoman(s.charAt(i));
            if (i + 1 < len) {
                int s2 = valueOfRoman(s.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }
}
