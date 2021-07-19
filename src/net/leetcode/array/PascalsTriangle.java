package net.leetcode.array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        for (int i = 1; i < numRows; i++) {
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 1; j < i; j++) {
                newList.add(list.get(j - 1) + list.get(j));
            }
            newList.add(1);
            lists.add(newList);
            list = newList;
        }
        return lists;
    }

    public static void main(String[] args) {
        System.out.println(generate(6));
    }
}
