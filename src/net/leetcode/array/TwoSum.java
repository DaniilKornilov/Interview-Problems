package net.leetcode.array;

import java.util.Arrays;
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
            Integer value = map.get(target - nums[i]);
            if (value != null) {
                return new int[]{i, value};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] answer = twoSum(nums, target);
        int[] answer2 = twoSum2(nums, target);
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}
