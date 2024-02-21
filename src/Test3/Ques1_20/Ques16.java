package Test3.Ques1_20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ques16 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("where");
        words.add("Whether");

        processStringArray(words, /* */);

    }

    private static void processStringArray(List<String> list, Predicate<String> predicate){
        for(String str : list){
            if(predicate.test(str)){
                System.out.println(str);
            }
        }
    }
    
}

/*Interface java.util.function.Predicate<T> declares below non-overriding abstract method:

boolean test(T t);



Let's check all the options one by one:

p -> true ✓ Means test method returns true for the passed String. It will print all the elements of the List.

p -> !!!!true ✓ !!!!true => !!!false => !!true => !false => true, means test method returns true for the passed String. It will print all the elements of the List.

p -> !!false ✗ !!false => !true => false, means test method returns false for the passed String. It will not print even a single element of the list.

p -> p.length() >= 1 ✓ Means test method returns true if passed String's length is greater than or equal to 1 and this is true for all the list elements.

p -> p.length() < 7 ✗ Means test method returns true if passed String's length is less than 7 and this is not true for "whether". "whether" will not be displayed in the output.

(String p) -> p.length() < 100 ✓ Means test method returns true if passed String's length is less than 100 and this is true for all the list elements.

String p -> p.length() > 0 ✗ Round brackets or parenthesis are missing around 'String p'. This causes compilation error. */
