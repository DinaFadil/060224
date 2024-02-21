package Test3.Ques1_20;

class Base{
    String msg = "INHALE";
}

class Derived extends Base{
    Object msg = "EXHALE";
}

public class Ques2 {

    public static void main(String[] args) {
        Base obj1 = new Base();
        Base obj2 = new Derived();
        Derived obj3 = (Derived) obj2;
        String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg;
        System.out.println(text);
    }
    
}
/*Subclass overrides the methods of superclass but it hides the variables of superclass.



Line n2 hides the variable created at Line n1, there is no rules related to hiding (type and access modifier can be changed).



At Line n3, obj1 is of Base type and refers to an instance of Base class.



At Line n4, obj2 is of Base type and refers to an instance of Derived class.



At Line n5, as obj2 refers to an instance of Derived class, hence typecasting it to Derived type doesn't cause any Exception. obj3 is of Derived type and refers to an instance of Derived class.



Let's check the expression of Line n6:

obj1.msg + "-" + obj2.msg + "-" + obj3.msg;

=> (obj1.msg + "-") + obj2.msg + "-" + obj3.msg; //+ operator is left to right associative and behaves as concatenation operator as one of the operand is of String type.

=> ((obj1.msg + "-") + obj2.msg) + "-" + obj3.msg;

=> (((obj1.msg + "-") + obj2.msg) + "-") + obj3.msg;

Let's solve the expression now:

=> ((("INHALE" + "-") + obj2.msg) + "-") + obj3.msg; //obj1 is of Base type, hence obj1.msg refers to "INHALE"

=> (("INHALE-" + obj2.msg) + "-") + obj3.msg;

=> (("INHALE-" + "INHALE") + "-") + obj3.msg; //obj2 is of Base type, hence obj2.msg refers to "INHALE"

=> ("INHALE-INHALE" + "-") + obj3.msg;

=> "INHALE-INHALE-" + obj3.msg;

In above expression, left operand is of String type and right operand is of Object type, so toString() method is invoked. So, given expression is evaluated as:

=> "INHALE-INHALE-" + obj3.msg.toString();

=> "INHALE-INHALE-" + "EXHALE"; //As obj3.msg is of Object type and refers to an instance of String type, hence toString() method on "EXHALE" instance is invoked and this returns "EXHALE".

=> "INHALE-INHALE-EXHALE";



Line n7 prints INHALE-INHALE-EXHALE on to the console. */