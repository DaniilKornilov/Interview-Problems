package net.leetcode;

//https://leetcode.com/problems/excel-sheet-column-number/

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        int carry = length - 1;
        for (int i = 0; i < length; i++) {
            char c = columnTitle.charAt(i);
            if (carry != 0) {
                result += ((int) c - 64) * Math.pow(26, carry);
            } else {
                result += ((int) c - 64);
            }
            carry--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
}
