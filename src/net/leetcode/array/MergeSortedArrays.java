package net.leetcode.array;

//https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i != m && j != n) {
            if (temp[i] <= nums2[j]) {
                nums1[k] = temp[i];
                k++;
                i++;
            } else {
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i != m) {
            nums1[k] = temp[i];
            k++;
            i++;
        }

        while (j != n) {
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        int[] nums1 = new int[n + m];
        for (int i = 0; i < m; i++) {
            nums1[i] = i;
        }
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = i;
        }
        merge(nums1, m, nums2, n);

        m = 0;
        n = 1;
        nums1 = new int[n + m];
        nums2 = new int[n];
        nums2[0] = 1;
        merge(nums1, m, nums2, n);
    }
}
