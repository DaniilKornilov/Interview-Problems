package net.leetcode.math;

//https://leetcode.com/problems/add-digits/

public class AddDigits {
    public static int addDigits(int num) {
        int result = Integer.MAX_VALUE;

        while (result >= 10) {
            int temp = 0;
            while (num != 0) {
                temp = temp + num % 10;
                num /= 10;
            }
            result = temp;
            num = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(0));
    }
}
