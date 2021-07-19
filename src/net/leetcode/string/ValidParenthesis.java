package net.leetcode.string;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/

public class ValidParenthesis {

    public static boolean isValid(String s) {
        String[] string = s.split("");
        Stack<String> stack = new Stack<>();
        for (String current : string) {
            switch (current) {
                case "(" -> stack.push(")");
                case "{" -> stack.push("}");
                case "[" -> stack.push("]");
                default -> {
                    if (stack.size() == 0) {
                        return false;
                    }
                    if (!stack.pop().equals(current)) {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
