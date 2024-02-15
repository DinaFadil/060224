package lesson4.InnerClass;
import java.util.Scanner;

public class MainOuter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OuterClass outer = new OuterClass();
        System.out.println("Enter your name: ");
        String f = scanner.next();
        //OuterClass.Inner inner = outer.new Inner("InnerObject");
        OuterClass.Inner inner = outer.new Inner(f);
        System.out.println("Inner Name: " + inner.getName());

        scanner.close();
    }
}

/*import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your start term: ");
        int f = scanner.nextInt(); */
