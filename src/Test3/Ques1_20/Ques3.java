package Test3.Ques1_20;

class Currency {
    String notation = "-";

    String getNotation(){
        return notation;
    }
}

class USDollar extends Currency{
    String notation = "$";

    String getNotation(){
        return notation;
    }
}

class Euro extends Currency{
    String notation = "#";

    String getNotation(){
        return notation;
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Currency c1 = new USDollar();
        System.out.println(c1.notation + ":" + c1.getNotation());

        Currency c2 = new Euro();
        System.out.println(c2.notation + ":" + c2.getNotation());
    }
    
}

/*Subclass overrides the methods of superclass but it hides the variables of superclass.



Line n3 hides the variable created at Line n1 and Line n4 overrides the getNotation() method of Line n2. There is no compilation error for USDollar class as it correctly overrides getNotation() method.

Similarly, Line n5 hides the variable created at Line n1 and Line n6 overrides the getNotation() method of Line n2. There is no compilation error for Euro class as it correctly overrides getNotation() method as well.



'c1' is of Currency type, hence c1.notation refers to "-" and c1.getNotation() invokes overriding method of USDollar class and it returns "$".

Similarly, c2.notation refers to "-" and c2.getNotation() invokes overriding method of Euro class and it returns "€". */
