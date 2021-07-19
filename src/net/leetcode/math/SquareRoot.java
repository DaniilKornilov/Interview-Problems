package net.leetcode.math;

//https://leetcode.com/problems/sqrtx/

public class SquareRoot {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int r = x / 2;
        int l = 0;
        int m;
        while (l <= r) {
            m = (l + r) / 2;
            long temp = (long) m * m;
            if (temp == x) {
                return m;
            }
            if (temp < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
