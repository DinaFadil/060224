package lesson8.Generic.GenericStack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    // Pushes an item onto the stack
    public void push(T item) {
        stack.add(item);
    }

    // Pops and returns the top item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test with Integer
        Scanner sc = new Scanner(System.in);
        GenericStack<Integer> intStack = new GenericStack<>();
     
        System.out.println("Add integers to the stack (enter -1 to stop): ");
        int input;
        while ((input = sc.nextInt()) != -1) {
            intStack.push(input);
        }

        System.out.println("Popping from intStack: ");
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        // Test with String
        GenericStack<String> stringStack = new GenericStack<>();
        System.out.print("Please enter the number of strings you want to enter: ");
        // takes an integer input
        String[] string = new String[sc.nextInt()];
        // consuming the <enter> from input above
        sc.nextLine();
        String in;
        for (int i = 0; i < string.length; i++) {
            in = sc.nextLine();
            stringStack.push(in);
        }

        System.out.println("\nPopping from stringStack: ");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }

        sc.close();
    }
}
