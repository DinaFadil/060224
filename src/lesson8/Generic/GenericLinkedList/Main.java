package lesson8.Generic.GenericLinkedList;

public class Main {
    public static void main(String[] args) {
        // Testing GenericLinkedList with Integer
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        // intList.add(1);
        intList.add(2);
        // intList.add(3);
        System.out.println("Integer List: " + intList.isEmpty()); // Should print false

        intList.remove(2);
        System.out.println("Integer List after removing 2: " + intList.isEmpty()); // Should print false

        // Testing GenericLinkedList with String
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String List: " + stringList.isEmpty()); // Should print false

        stringList.remove("Hello");
        System.out.println("String List after removing 'Hello': " + stringList.isEmpty()); // Should print false

        // Testing GenericLinkedList with Character
        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('A');
        charList.add('B');
        System.out.println("Character List: " + charList.isEmpty()); // Should print false

        charList.remove('A');
        System.out.println("Character List after removing 'A': " + charList.isEmpty()); // Should print false
    }
}
