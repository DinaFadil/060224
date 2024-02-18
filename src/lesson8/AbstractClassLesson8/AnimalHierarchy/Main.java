package lesson8.AbstractClassLesson8.AnimalHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();

        int selection = 0;

        while (selection != 4) {
            Thread.sleep(1000);
            System.out.println("\n1. Bird\n2. Cat\n3. Dog\n4. Exit");
            System.out.print("Enter number of selection: ");
            selection = scanner.nextInt();
            Thread.sleep(500);

            switch (selection) {
                case 1:
                    System.out.println("\nBird:\n1. Make Sound\n2. Sleep\n3. Eat");
                    System.out.print("Enter number of selection: ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1:
                            bird.makeSound();
                            break;
                        case 2:
                            System.out.println("\nBird is " + bird.sleep());
                            break;
                        case 3:
                            System.out.println("\nBird is " + bird.eat());
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nCat:\n1. Make Sound\n2. Sleep\n3. Eat");
                    System.out.print("Enter number of selection: ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1:
                            cat.makeSound();
                            break;
                        case 2:
                            System.out.println("\nCat is " + cat.sleep());
                            break;
                        case 3:
                            System.out.println("\nCat is " + cat.eat());
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nDog:\n1. Make Sound\n2. Sleep\n3. Eat");
                    System.out.print("Enter number of selection: ");
                    selection = scanner.nextInt();
                    switch (selection) {
                        case 1:
                            dog.makeSound();
                            break;
                        case 2:
                            System.out.println("\nDog is " + dog.sleep());
                            break;
                        case 3:
                            System.out.println("\nDog is " + dog.eat());
                            break;
                    }
                    break;
                case 4:
                    System.out.println("\nExit the program...");
                    break;
                default:
                    System.out.println("\nInvalid number!");
                    break;
            }
        }
        scanner.close();
        
    }
}
