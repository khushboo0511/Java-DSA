package com.khushboo;

public class CustomMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(10);

        stack.push(35);
        stack.push(23);
        stack.push(42);
        stack.push(10);
        stack.push(15);
        stack.push(22);
        stack.push(43);
        stack.push(76);
        stack.push(42);
        stack.push(74);
        stack.push(66);
        stack.push(13);


        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());


    }
}
