package net.leetcode.string;

//https://leetcode.com/problems/string-to-integer-atoi/

public class StringToInteger {
    private int len;
    private boolean isPositive;
    private int pos;

    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("4193 with words"));
        System.out.println(new StringToInteger().myAtoi("42"));
        System.out.println(new StringToInteger().myAtoi("   -42"));
    }

    public boolean isInBounds(int pos) {
        return (pos < len);
    }

    public int skipWhiteSpaces(String s) {
        while (isInBounds(pos) && (s.charAt(pos) == ' ')) {
            pos++;
        }
        return pos;
    }

    public boolean isPositive(String s) {
        boolean isPositive = true;
        if (isInBounds(pos) && (s.charAt(pos) == '-')) {
            isPositive = false;
            pos++;
        } else if (isInBounds(pos) && (s.charAt(pos) == '+')) {
            pos++;
        }
        return isPositive;
    }

    public int parseNumber(String s) {
        int result = 0;
        while (isInBounds(pos) && Character.isDigit(s.charAt(pos))) {
            int digit = s.charAt(pos) - '0';
            if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = 10 * result + digit;
            pos++;
        }
        return result;
    }

    public int myAtoi(String s) {
        len = s.length();
        pos = skipWhiteSpaces(s);
        isPositive = isPositive(s);
        int result = parseNumber(s);
        return isPositive ? result : -result;
    }
}
