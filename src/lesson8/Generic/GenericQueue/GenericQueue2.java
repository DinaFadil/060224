package lesson8.Generic.GenericQueue;

import java.util.LinkedList;

public class GenericQueue2<T> {
    private LinkedList<T> queue;

    public GenericQueue2() {
        queue = new LinkedList<>();
    }

    // Adds an item to the queue
    public void enqueue(T item) {
        queue.addLast(item);
    }

    // Removes and returns the item at the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    // Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        // Test with Integer
        GenericQueue2<Integer> intQueue = new GenericQueue2<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println("Dequeue from intQueue: ");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        // Test with String
        GenericQueue2<String> stringQueue = new GenericQueue2<>();
        stringQueue.enqueue("apple");
        stringQueue.enqueue("banana");
        stringQueue.enqueue("orange");

        System.out.println("\nDequeue from stringQueue: ");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }

        // Test with Boolean
        GenericQueue2<Boolean> booleanQueue = new GenericQueue2<>();
        booleanQueue.enqueue(true);
        booleanQueue.enqueue(false);
        booleanQueue.enqueue(true);

        System.out.println("\nDequeue from booleanQueue: ");
        while (!booleanQueue.isEmpty()) {
            System.out.println(booleanQueue.dequeue());
        }
    }
}

