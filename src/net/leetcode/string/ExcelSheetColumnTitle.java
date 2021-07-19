package net.leetcode.string;

//https://leetcode.com/problems/excel-sheet-column-title/

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int n = columnNumber % 26;
            columnNumber /= 26;
            if (n > 0) {
                sb.append((char) (n + 64));
            } else {
                sb.append('Z');
                columnNumber--;
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
