package Test3.Ques1_20;

interface Perishable1{
    default int maxDays(){
        return 1;
    }
}

interface Perishable2 extends Perishable1 {
    default int maxDays(){
        return 2;
    }
}

class Milk implements Perishable2, Perishable1{}

public class Ques11 {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        System.out.println(obj.maxDays());
    }
    
}

/*As per Java 8, default methods were added in the interface. Interface Perishable1 defines default method maxDays(), there is no compilation error in interface Perishable1. Method maxDays() is implicitly public in Perishable1.



interface Perishable2 extends Perishable1 and it overrides the default method maxDays() of Document, overriding method in Perishable2 is implicitly public. Interface Perishable2 compiles successfully.



Class Milk implements Perishable2 and Perishable1. Although it is redundant for Milk class to implement Preishable1 as Perishable2 already extends Perishable1.

There is no conflict in Milk class as it inherits the default method maxDays() of Perishable2 interface. Milk class compiles successfully.



`Perishable1 obj = new Milk();` It compiles fine as Perishable1 is supertype and Milk is subtype.

`obj.maxDays()` executes the default maxDays() method of Perishable2 interface and it returns 2. `System.out.println(obj.maxDays());` prints 2 on to the console. */
