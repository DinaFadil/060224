package Test3.Ques21_40;

class Base{
    int id = 1000;

    Base(){
        Base();
    }

    void Base(){
        System.out.println(++id);
    }
}

class Derived extends Base{
    int id = 2000;

    Derived(){}

    void Base(){
        System.out.println(--id);
    }
}

public class Ques27 {
    public static void main(String[] args) {
        Base base = new Derived();
    }
    
}
/*Method can have same name as that of the Class. Hence, void Base() is a valid method declaration in Base class.



Line n2 invokes the Base() method and not the constructor.



Subclass overrides the methods of superclass but it hides the variables of superclass.



Line n5 hides the variable created at Line n1, there is no rules related to hiding (type and access modifier can be changed).



Line n7 correctly overrides the Base() method of class Base.



Compiler adds super(); as the 1st statement inside the no-argument constructor of Base class and Derived class.



There is no compilation error, so let's check the execution.



new Derived() at Line n9 invokes the constructor of Derived class, at this point instance variable id is declared and 0 is assigned to it. In fact, instance variable id of Base class is also declared and 0 is assigned to it. Compiler added super(); as the first statement inside this constructor, hence control goes to the no-argument constructor of Base class.



Compiler added super(); as the first statement inside this constructor as well, hence it invokes the no-argument constructor of the Object class. No-argument constructor of Object class finishes its execution and control goes back to the constructor of Base class. Before it starts executing remaining statements inside the constructor, instance variable assignment statement (if available) are executed. This means 1000 is assigned to variable id of Base class.



Line n2 is executed next, Base() method defined in Derived class is executed. Which overriding method to invoke, is decided at runtime based on the instance. Instance is of Derived class (because of Line n9), hence control starts executing Base() method of Derived class.

Line n8 is executed next, Derived class hides the id variable of Base class and that is why at Line n8, id points to variable created at Line n5. This id variable still stores the value 0 as Base class's constructor has not finishes its execution.



value of id is decremented by 1, so id becomes -1 and -1 is printed on to the console. Base() method finishes its execution and control goes back to Line n2. No-argument constructor of Base class finishes its execution and control goes back to the constructor of Derived class. Before it starts executing remaining statements inside the constructor, instance variable assignment statement (if available) are executed. This means 2000 is assigned to variable id of Derived class.



No-argument constructor of Derived class finishes its execution and control goes back to Line n9. main(String []) method finishes its execution and program terminates successfully.



Hence, output is -1. */