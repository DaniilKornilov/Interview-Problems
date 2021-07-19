package net.leetcode;

//https://leetcode.com/problems/majority-element/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //Boyer-Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    //HashMap
    public static int majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int majorityFeature = nums.length / 2;
        for (Integer key : map.keySet()) {
            if (map.get(key) > majorityFeature) {
                return key;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        System.out.println(majorityElement1(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
