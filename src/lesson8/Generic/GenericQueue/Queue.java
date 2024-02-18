package lesson8.Generic.GenericQueue;

public interface Queue<T> {

    public void enqueue(T item);
    public T dequeue();
    public boolean isEmpty();
} 
    
