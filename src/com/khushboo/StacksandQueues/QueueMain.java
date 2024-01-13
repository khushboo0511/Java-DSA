package com.khushboo.StacksandQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new DynamicQueue(10);

        queue.insert(21);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(11);
        queue.insert(13);
        queue.insert(16);
        queue.insert(17);
        queue.insert(15);
        queue.insert(19);
        queue.insert(14);



        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
    }
}
