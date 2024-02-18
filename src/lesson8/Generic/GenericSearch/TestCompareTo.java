package lesson8.Generic.GenericSearch;

public class TestCompareTo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        // Test linear search
        GSer<Integer> intSearch = new GSer<>(intArray);
        System.out.println(intSearch.binarySearch(7));
    }
    
}





