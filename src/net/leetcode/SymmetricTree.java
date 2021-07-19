package net.leetcode;

//https://leetcode.com/problems/symmetric-tree/

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private static boolean isMirror(TreeNode q, TreeNode p) {
        if (p == null && q == null) {
            return true;
        }
        if (q == null || p == null) {
            return false;
        }
        return (p.val == q.val)
                && isMirror(p.left, q.right)
                && isMirror(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
