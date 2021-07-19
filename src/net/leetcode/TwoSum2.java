package net.leetcode;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int k = Arrays.binarySearch(numbers, target - number);
            if (k >= 0 && k != i) {
                if (k < i) {
                    return new int[]{k + 1, i + 1};
                } else {
                    return new int[]{i + 1, k + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum1(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{i + 1, j + 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{5, 25, 75}, 100)));
        System.out.println(Arrays.toString(twoSum1(new int[]{5, 25, 75}, 100)));
    }
}
