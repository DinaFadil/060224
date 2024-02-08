package lesson2;

//import java.io.IOException;
//import java.util.Scanner;


public class ElvisOperator {
    public static void main(String[] args) {
        int intA = 12;
        int intB = 14;

        System.out.println();
        //intA = scanner.nextInt();


        // int highest = (intA > intB) ? intA : intB;
        int highest = (intA > intB) ? (intA < 15) ? 15 : 20 : intB;

        System.out.println(highest);
        //scanner.close();
    }

}

 /*try {
            System.out.println("Enter an int A number: ");
            intA = System.in.read();
            System.out.println("Enter an int B number: ");
            intB = System.in.read();
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }*/
