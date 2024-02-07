package Assignments;
public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        System.out.println("Arguments passed: ");
        for (String arg : args) {
            System.out.println(arg);
        }
        ass1();
    }

    public static void ass1() {
        int integerNumber = 10;
        double doubleNumber = 3.14;
        boolean boolValue = true;
        char charValue = 'A';
        String stringValue = "Hello World!";

        System.out.println("\nUnderstanding Data Types");
        System.out.println("Integer number: " + integerNumber);
        System.out.println("Double number: " + doubleNumber);
        System.out.println("Boolean value: " + boolValue);
        System.out.println("Character value: " + charValue);
        System.out.println("String value: " + stringValue);
    }

    

}
