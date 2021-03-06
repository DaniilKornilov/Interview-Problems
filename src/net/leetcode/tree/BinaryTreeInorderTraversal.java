package net.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/

public class BinaryTreeInorderTraversal {

    List<Integer> nodeValues = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            nodeValues.add(root.val);
            inorderTraversal(root.right);
        }
        return nodeValues;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            res.add(current.val);
            current = current.right;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
        System.out.println(b.inorderTraversal(root));
        System.out.println(b.inorderTraversal1(root));
    }
}
