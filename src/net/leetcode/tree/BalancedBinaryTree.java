package net.leetcode.tree;

//https://leetcode.com/problems/balanced-binary-tree/

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (balanceFactor(root) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int balanceFactor(TreeNode root) {
        return Math.abs(height(root.left) - height(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(isBalanced(root));
    }
}
