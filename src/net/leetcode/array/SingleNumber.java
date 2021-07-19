package net.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length - 1);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static int singleNumber1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static int singleNumber2(int[] nums) {
        int sumSet = 0;
        int sumNums = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                sumSet += num;
            }
            sumNums += num;
        }
        return 2 * sumSet - sumNums;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1, 1, 3, 4, 4}));
        System.out.println(singleNumber1(new int[]{2, 2, 1, 1, 3, 4, 4}));
        System.out.println(singleNumber2(new int[]{2, 2, 1, 1, 3, 4, 4}));
    }
}
