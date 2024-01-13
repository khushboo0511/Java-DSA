package com.khushboo.StacksandQueues;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push (int item) {
        if(this.isFull()) {
            int[] temp = new int[data.length * 2];
            int i;
            for (i=0; i<data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;

        }
        return super.push(item);
    }

    public static class CustomMain {
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
}
