package net.leetcode.design;

//https://leetcode.com/problems/implement-stack-using-queues/

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.remove();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.empty());
    }
}
