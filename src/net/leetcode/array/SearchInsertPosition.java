package net.leetcode.array;

import java.util.Arrays;

//https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    //using java
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            return Math.abs(index) - 1;
        } else {
            return index;
        }
    }

    //custom implementation
    public static int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    public static int searchInsert1(int[] nums, int target) {
        return binarySearch(nums, target);
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1}, 0));
        System.out.println(searchInsert1(new int[]{1}, 0));
    }
}
