package com.khushboo.StacksandQueues;

import java.util.Stack;

public class QueuesUsingStacks {
    Stack<Integer> first;
    Stack<Integer> second;

    public QueuesUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item) {
        first.push(item);
    }
    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }


    public static void main(String[] args) {
        QueuesUsingStacks queue = new QueuesUsingStacks();

        try {
            queue.add(12);
            queue.add(22);
            queue.add(27);
            queue.add(65);
            queue.add(54);

            System.out.println("Original First Stack: " + queue.first);
            System.out.println("Original Second Stack: " + queue.second);

            queue.remove();
            queue.remove();

            System.out.println("Modified First Stack: " + queue.first);
            System.out.println("Modified Second Stack: " + queue.second);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
