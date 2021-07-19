package net.leetcode.string;

//https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        int arrayLength = strings.length;
        return (arrayLength == 0) ? 0 : strings[arrayLength - 1].length();
    }

    public static int lengthOfLastWord1(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   "));
        System.out.println(lengthOfLastWord1("   "));
    }
}
