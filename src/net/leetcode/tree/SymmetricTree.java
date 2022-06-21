package net.leetcode.tree;

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
        if (p.val == q.val) {
            return isMirror(p.left, q.right) &&
                    isMirror(p.right, q.left);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
