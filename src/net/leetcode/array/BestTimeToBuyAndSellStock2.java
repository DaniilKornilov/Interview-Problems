package net.leetcode.array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class BestTimeToBuyAndSellStock2 {
    public static int maxProfit2(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int bestProfit = 0;
        int r = 1;
        int l = 0;
        while (l <= prices.length - 2 && r <= prices.length - 1) {
            if (prices[l] >= prices[r]) {
                l = r;
                r = l + 1;
            } else {
                bestProfit += prices[r] - prices[l];
                l = r;
                r++;
            }
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
