package net.leetcode;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-preorder-traversal/

public class BinaryTreePreorderTraversal {
    List<Integer> list = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreePreorderTraversal b = new BinaryTreePreorderTraversal();
        System.out.println(b.preorderTraversal(root));
    }
}
