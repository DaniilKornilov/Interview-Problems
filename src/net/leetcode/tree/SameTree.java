package net.leetcode.tree;

//https://leetcode.com/problems/same-tree/

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (q == null || p == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = null;
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = null;
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(4);

        System.out.println(isSameTree(root1, root2));
    }
}