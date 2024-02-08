package lesson2_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter int A: ");
        int intA = scanner.nextInt();
        factorial(intA);
        System.out.println(factorial(intA));
        scanner.close();
        
    }

    static long factorial(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }

    }

}
