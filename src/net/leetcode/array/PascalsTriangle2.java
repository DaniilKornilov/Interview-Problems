package net.leetcode.array;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle-ii/

public class PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for (int j = 1; j < i; j++) {
                newList.add(list.get(j - 1) + list.get(j));
            }
            newList.add(1);
            list = newList;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getRow(6));
    }
}
