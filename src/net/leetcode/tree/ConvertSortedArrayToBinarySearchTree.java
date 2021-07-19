package net.leetcode.tree;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrToBST(nums, left, mid - 1);
        root.right = sortedArrToBST(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
        System.out.println(b.inorderTraversal(sortedArrayToBST(new int[]{1, 2, 3, 4, 5})));
    }
}
