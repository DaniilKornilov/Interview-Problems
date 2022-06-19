package net.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> output = new ArrayList<>();
        output.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            int lastIndex = output.size() - 1;
            int lastEnd = output.get(lastIndex)[1];

            if (start <= lastEnd) {
                output.get(lastIndex)[1] = Math.max(lastEnd, end);
            } else {
                output.add(new int[]{start, end});
            }
        }

        return output.toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
