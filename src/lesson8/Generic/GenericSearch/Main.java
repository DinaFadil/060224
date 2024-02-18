package lesson8.Generic.GenericSearch;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        String[] stringArray = {"apple", "banana", "orange", "pear", "grape"};

        // Test linear search
        GenericSearch<Integer> intSearch = new GenericSearch<>(intArray);
        System.out.println("Index of 5 in intArray (linear search): " + intSearch.linearSearch(5));

        GenericSearch<String> stringSearch = new GenericSearch<>(stringArray);
        System.out.println("Index of 'pear' in stringArray (linear search): " + stringSearch.linearSearch("pear"));

        // Test binary search (requires the array to be sorted)
        System.out.println("Index of 5 in intArray (binary search): " + intSearch.binarySearch(5));
        System.out.println("Index of 'pear' in stringArray (binary search): " + stringSearch.binarySearch("pear"));
    }
}

//import java.util.Scanner;
/*//FOR INT
        Scanner sc = new Scanner(System.in);
        // Test with different data types
        System.out.println("Enter integers:");
        int[] result = new int[7];
        int i = 0;
        while (i < result.length) {
            result[i] = sc.nextInt();
            i++;
        }
        Integer[] intArray = new Integer[result.length];
        for (int j = 0; j < result.length; j++) {
            intArray[j] = result[j];
        } */

/*//FOR STRING
        System.out.println("Enter strings:");
        String[] resultstring = new String[7];
        int m = 0;
        while (m < resultstring.length) {
            resultstring[m] = sc.nextLine();
            m++;
        }
        sc.close();
        String[] stringArray = new String[resultstring.length];
        for (int n = 0; n < resultstring.length; n++) {
            stringArray[n] = resultstring[n];
        } */

    
