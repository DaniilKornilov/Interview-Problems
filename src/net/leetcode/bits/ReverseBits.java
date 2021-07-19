package net.leetcode.bits;

//https://leetcode.com/problems/reverse-bits/

public class ReverseBits {
    public static int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret <<= 1;
            if ((n & 1) > 0) {
                ret |= 1;
            }
            n >>>= 1;
        }
        return ret;
    }

    public static int test(int n) {
        return n >> 1;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
        System.out.println(test(9));
    }
}
