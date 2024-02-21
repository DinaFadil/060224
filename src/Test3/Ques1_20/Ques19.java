package Test3.Ques1_20;

interface M{
    public static void log(){
        System.out.println("M");
    }
}

abstract class A{
    public static void log(){
        System.out.println("N");
    }
}

class MyClass extends A implements M {}

public class Ques19 {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        obj1.log();

        A obj2 = new MyClass();
        obj2.log();

        MyClass obj3 = new MyClass();
        obj3.log();
    }
    
}

/*As per Java 8, default and static methods were added in the interface. Interface M defines static method log(), there is no compilation error in interface M.

Also the scope of static log() method of M is limited to interface M and it can be invoked by using Interface name only, M.log().



Abstract class A also defines the static log() method. Abstract class can have 0 or more abstract methods. Hence, no compilation error in class A as well.



Super type reference variable can refer to an instance of Sub type, therefore the statement `M obj1 = new MyClass();` compiles successfully.

obj1 is of M type, hence `obj1.log();` tries to tag the static method of M but static log() method of M can only be invoked by using M.log();.

Therefore, Line n1 causes compilation error.



Scope of static log() method of A is not limited to class A only but MyClass also gets A.log() method in its scope.

There are different ways in which static method of an abstract class can be accessed:

1. By using the name of the abstract class: A.log(); //Preferred way

2. By using the reference variable of abstract class: A o1 = null; o1.log();

3. By using the name of the subclass: MyClass.log();

4. By using the reference variable of the subclass: MyClass o2 = null; o2.log();

Hence, Line n2 and Line n3 compile successfully. */
