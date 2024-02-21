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
