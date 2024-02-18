package lesson8.Generic.GenericSearch;

public class GenericSearch<T extends Comparable<T>> {
    private T[] array;

    public GenericSearch(T[] array) {
        this.array = array;
    }

    // Linear search method
    public int linearSearch(T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(key) == 0) {
                return i; // Key found, return index
            }
        }
        return -1; // Key not found
    }

    // Binary search method (requires the array to be sorted)
    public int binarySearch(T key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int cmp = array[mid].compareTo(key);
            if (cmp == 0) {
                return mid; // Key found, return index
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Key not found
    }

}
