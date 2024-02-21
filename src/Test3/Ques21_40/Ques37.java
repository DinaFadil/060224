package Test3.Ques21_40;

class Parent{
    String quote = "MONEY DOESN'T GROW ON TREES";
}

class Child extends Parent{
    String quote = "LIVE LIFE KING SIZE";
}

class GrandChild extends Child{
    String quote = "PLAY PLAY PLAY";
}

public class Ques37 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println(/*INSERT */);
    }
    
}

// BETULL
// ((Parent)gc).quote
// ((Parent)(Child)gc).quote

// SALAH
// gc.quote
// (Parent)gc.quote
// (Parent)(Child)gc.quote

/*As instance variables are hidden by subclasses and not overridden, therefore instance variable can be accessed by using explicit casting.

Let's check all the options one by one:

gc.quote => It refers to "PLAY PLAY PLAY" as gc is of GrandChild class.



(Parent)gc.quote => gc.quote will be evaluated first as dot (.) operator has higher precedence than cast. gc.quote refers to String, hence it cannot be casted to Parent type. This would cause compilation error.



((Parent)gc).quote => Variable 'gc' is casted to Parent type, so this expression refers to "MONEY DOESN'T GROW ON TREES". It is one of the correct options.



((Parent)(Child)gc).quote => 'gc' is of GrandChild type, it is first casted to Child and then to Parent type and finally quote variable is accessed, so this expression refers to "MONEY DOESN'T GROW ON TREES". It is also one of the correct options.



(Parent)(Child)gc.quote => gc.quote will be evaluated first as dot (.) operator has higher precedence than cast. gc.quote refers to String, hence it cannot be casted to Child type. This would cause compilation error. */
