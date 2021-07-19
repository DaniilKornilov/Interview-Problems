package net.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        LinkedList<String> list = new LinkedList<>();
        ArrayList<Integer> cache = new ArrayList<>(nums.length);
        cache.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - cache.get(cache.size() - 1) != 1) {
                int first = cache.get(0);
                int last = cache.get(cache.size() - 1);
                if (first == last) {
                    list.add(String.valueOf(first));
                } else {
                    list.add(first + "->" + last);
                }
                cache = new ArrayList<>();
            }
            cache.add(nums[i]);
        }

        if (cache.size() == 1) {
            list.add(String.valueOf(cache.get(0)));
        } else {
            list.add(cache.get(0) + "->" + cache.get(cache.size() - 1));
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}
