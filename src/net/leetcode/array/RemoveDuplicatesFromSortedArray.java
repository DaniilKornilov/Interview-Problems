package net.leetcode.array;

import java.util.LinkedHashSet;
import java.util.Set;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {
    //using set (better memory consumption)
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Integer[] temp = set.toArray(new Integer[0]);
        for (int i = 0; i < set.size(); i++) {
            nums[i] = temp[i];
        }
        return set.size();
    }

    //2-pointers approach (better speed)
    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] < nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    //streams
    public static int removeDuplicates2(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        nums = set.stream().mapToInt(Integer::intValue).toArray();
        int[] primitives = set.stream().mapToInt(Integer::intValue).toArray();
        System.arraycopy(primitives, 0, nums, 0, set.size());
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates1(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates2(new int[]{1, 1, 2}));
    }
}
