package lesson2_2;
import java.util.Scanner;

public class FlowStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int intA = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int intB = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int intC = sc.nextInt();

        System.out.println(BloC(intA, intB, intC));
        sc.close();
    }

    public static int BloC(int a, int b, int c){
        int m = 0;
        m = (a <= b) ? b : a;
        m = (m >= c) ? m : c; 
        return m;
    }

}
