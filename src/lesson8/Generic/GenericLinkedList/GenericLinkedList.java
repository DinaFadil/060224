package lesson8.Generic.GenericLinkedList;

public class GenericLinkedList<T> {
    private Node<T> head;

    // Inner class name Node
    private static class Node<T> {
        T data;
        Node<T> next;

        // Node constructor
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // to add new element
    public void add(T item) {
        // create new Node object with item as the data
        Node<T> newNode = new Node<>(item);
        // check if list empty (null head means empty)
        if (head == null) {
            // assign new node as head of the linked list
            head = newNode;
        } else {
            // assign the head value to current
            Node<T> current = head;
            // iterate to find the last node (.next == null)
            while (current.next != null) {
                current = current.next;
            }
            // assign .next value of a node to newNode
            current.next = newNode;
        }
    }

    public void remove(T item) {
        // check whether list empty or not
        if (head == null) {
            // return if the list empty (nothing to be removed)
            return;
        }

        // check if the head is the one to be removed (if data in head is same to item)
        if (head.data.equals(item)) {
            // change the head to the next node in line (remove current head)
            head = head.next; // the new head will be null if the first and last element is the head
            return;
        }

        // assign current with head
        Node<T> current = head;
        // if the next node is not null and its data is no item
        while (current.next != null && !current.next.data.equals(item)) {
            // assign current to the next node in line
            current = current.next;
        }

        
        if (current.next != null) {
            // only will be executed if the node to be deleted is found
            // assign the current node.next to the second node in front of it (skipped the node that we want to remove)
            current.next = current.next.next;
        }
    }

    public boolean isEmpty() {
        // if head is null, list is empty
        return head == null;
    }
}
