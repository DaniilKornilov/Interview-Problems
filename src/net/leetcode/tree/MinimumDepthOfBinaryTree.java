package net.leetcode.tree;

//https://leetcode.com/problems/minimum-depth-of-binary-tree/

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return findDepth(root);
    }

    private static int findDepth(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(findDepth(root.left), findDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(minDepth(root));
    }
}
