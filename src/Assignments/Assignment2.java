package Assignments;
import java.util.Scanner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        System.out.println("Enter the minimum value: ");
        int min = sc.nextInt();
        System.out.println("Enter the maximum value: ");
        int max = sc.nextInt();

        int [] random = genRandomArray(len, min, max);
        System.out.println(Arrays.toString(random));
        selectionSort(random, true);
        //selectionSort(array1, false);
        System.out.println(Arrays. toString(random));

        double mean = calculateMean(random);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(random);
        System.out.println("Median: " + median);

        // Calculate mode
        int mode = calculateMode(random);
        System.out.println("Mode: " + mode);
        sc.close();
    }

    public static int[] genRandomArray(int length, int Min, int Max){
        int [] m = new int[length];
        for (int i = 0; i<length; i++){
            m[i] = (int) Math.round(Math.random() * (Max - Min) + Min);
            //Math.random() generates numbers between 0 -1
            //(Max - Min) + Min => needed to scale the numbers in the right range
            //Math.round round off decimals to nearest int value
        }
        return m;
    }

    public static void selectionSort(int[] d, boolean inc){
        int idxToSwap, len = d.length;
        int temp;

        for(int i = 0; i<=(len-1); i++){
            int k = i == 0 ? 0 : i -1;
            if(inc){
                idxToSwap = findMinldx(d, k);
            }
            else{
                idxToSwap = findMaxldx(d, k);
            }
            temp = d[idxToSwap];
            d[idxToSwap] = d[k];
            d[k] = temp;

        }
    }

    public static int findMinldx(int[] d, int k){
        int minldx = k;
        for(int i = k + 1; i<d.length; i++){
            if(d[i] < d[minldx]){
                minldx = i;
            }
        }

        return minldx;
    }

    public static int findMaxldx(int[] d, int k){
        int maxldx = k;
        for(int i = k + 1; i<d.length; i++){
            if(d[i] > d[maxldx]){
                maxldx = i;
            }
        }

        return maxldx;
    }

    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }

    public static int calculateMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }
        return mode;
    }

}



