package net.leetcode.array;

//https://leetcode.com/problems/count-primes/

public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] seen = new boolean[n];
        int res = 0;
        for (int i = 2; i * i < n; i++) {
            if (!seen[i]) {
                for (int j = i; j * i < n; j++) {
                    seen[j * i] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!seen[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(1500000));
    }
}
