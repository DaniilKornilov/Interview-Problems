package net.leetcode.dynamic_programming;

//https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs {
    //dynamic programming
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //Fibonacci formula
    public static int climbStairs1(int n) {
        double sqrt5 = Math.sqrt(5);
        int power = n + 1;
        double fib = Math.pow((1 + sqrt5) / 2, power) - Math.pow((1 - sqrt5) / 2, power);
        return (int) (fib / sqrt5);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs1(3));
    }
}
