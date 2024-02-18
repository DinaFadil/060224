package lesson8.Generic.GenericSearch;

public class GSer<T extends Comparable<T>> {
    private T[] array;

    public GSer(T[] array) {
        this.array = array;
    }

    // Linear search method
    public int binarySearch(T key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int cmp = array[mid].compareTo(key);
            return cmp;
        }
        return -1; // Key not found
    }

    // Binary search method (requires the array to be sorted)

}