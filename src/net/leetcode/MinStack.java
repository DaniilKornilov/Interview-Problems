package net.leetcode;

//https://leetcode.com/problems/min-stack/

import java.util.LinkedList;

public class MinStack {
    private static class Entry {
        int value;
        int cached;

        Entry(int value, int cached) {
            this.value = value;
            this.cached = cached;
        }
    }

    private final LinkedList<Entry> list;
    private int min;

    public MinStack() {
        list = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val < min) {
            min = val;
        }
        list.addFirst(new Entry(val, min));
    }

    public void pop() {
        list.removeFirst();
        if (list.size() == 0) {
            min = Integer.MAX_VALUE;
        } else {
            min = list.getFirst().cached;
        }
    }

    public int top() {
        return list.getFirst().value;
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(4);
        minStack.push(-6);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
    }
}
