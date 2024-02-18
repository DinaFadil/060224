package lesson8.Generic.GenericQueue;

public class GenericQueue<T> implements Queue<T> {

    private java.util.Queue<T> queue; //this i refer chatGPT

    //constructor
    public GenericQueue() {
        this.queue = new java.util.LinkedList<>(); //this i refer chatGPT
    }


    //method 1 (add item)
    @Override
    public void enqueue(T item) {
        queue.add(item);
    }

    //method 2 (remove and return item in front of the queue)
    @Override
    public T dequeue() {
            if(isEmpty()) {
                return null;
            }
            return queue.poll();
    }
    
    //method 3 (return true if the queue is empty, false otherwise)
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
}