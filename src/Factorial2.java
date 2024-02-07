import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        int nFact = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= n; i++)
            nFact = nFact*i;
        
        System.out.println("n!= " + nFact);
    }
}
