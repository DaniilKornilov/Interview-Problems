package net.leetcode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }

    private static int findDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        return Math.max(findDepth(root.left, depth + 1), findDepth(root.right, depth + 1));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(maxDepth(root));
    }
}
