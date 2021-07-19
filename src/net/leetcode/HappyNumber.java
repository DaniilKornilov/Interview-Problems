package net.leetcode;

//https://leetcode.com/problems/happy-number/

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    private final Set<Integer> set = new HashSet<>();

    private int sumSquares(int n) {
        int res = 0;
        while (n != 0) {
            res += Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        if (set.contains(n)) {
            return false;
        } else {
            set.add(n);
        }
        if (n == 1) {
            return true;
        }
        return isHappy(sumSquares(n));
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(1));
    }
}
