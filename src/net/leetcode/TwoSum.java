package net.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/

public class TwoSum {
    //using bruteforce
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

    //using map
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            Integer value = map.get(temp);
            if (value != null && value != i) {
                return new int[]{i, value};
            }
        }
        return new int[]{0};
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] answer = twoSum(nums, target);
        int[] answer2 = twoSum2(nums, target);
        printArray(answer);
        printArray(answer2);
    }
}
