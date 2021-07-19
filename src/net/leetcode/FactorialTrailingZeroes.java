package net.leetcode;

//https://leetcode.com/problems/factorial-trailing-zeroes/

public class FactorialTrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(15));
    }

}
