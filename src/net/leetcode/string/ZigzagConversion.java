package net.leetcode.string;

//https://leetcode.com/problems/zigzag-conversion/

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int sLen = s.length();
        int inc = (numRows - 1) * 2;
        StringBuilder sb = new StringBuilder();
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            for (int curPos = rowNum; curPos < sLen; curPos += inc) {
                sb.append(s.charAt(curPos));
                if ((rowNum > 0) && (rowNum < numRows - 1)) {
                    int newPos = curPos + inc - 2 * rowNum;
                    if (newPos < sLen) {
                        sb.append(s.charAt(newPos));
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 5));
        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("PAYPALISHIRING", 4));
        System.out.println(convert("A", 1));
    }
}
