package lesson8.Generic.GenericQueue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class GenericQueue1<T> {
    private List<T> queue;

    public GenericQueue1() {
        queue = new ArrayList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.remove(queue.size() - 1);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericQueue1<Integer> intQueue = new GenericQueue1<>();

        System.out.println("Enter items to the queue (enter -1 to stop): ");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            intQueue.enqueue(input);
        }

        System.out.println("Popping from intStack: ");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        scanner.close();

    }

}
