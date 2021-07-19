package net.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int j = map.get(num);
                if (i - j <= k) {
                    return true;
                } else {
                    map.put(num, i);
                }
            } else {
                map.put(num, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}
