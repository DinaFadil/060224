package lesson8.AbstractClassLesson8.SortingAlgorithmInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Original array: " + Arrays.toString(array));

        long startTime = System.nanoTime();
        bubbleSort.sort(array);
        long endTime = System.nanoTime();
        System.out.println("Bubble sort: " + Arrays.toString(array) + " (Time: " + (endTime - startTime) + " ns)");

        startTime = System.nanoTime();
        selectionSort.sort(array);
        endTime = System.nanoTime();
        System.out.println("Selection sort: " + Arrays.toString(array) + " (Time: " + (endTime - startTime) + " ns)");

        startTime = System.nanoTime();
        insertionSort.sort(array);
        endTime = System.nanoTime();
        System.out.println("Insertion sort: " + Arrays.toString(array) + " (Time: " + (endTime - startTime) + " ns)");
    }
}
