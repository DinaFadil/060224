package Assignments;
import java.util.Scanner;

import java.util.Arrays;

public class GenerateArray {
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

}
