package Test3.Ques21_40;

public interface Flyable {
    static int horizontalDegree(){
        return 20;
    }

    default void fly(){
        System.out.println("Flying at " + horizontalDegree() + "degrees.");
    }

    void land();
    
}

public class Ques36 implements Flyable{
    public void land(){
        System.out.println("Flying at " + Flyable.horizontalDegree() + "degress.");
    }

    public static void main(String[] args) {
        new Ques36().fly();
        new Ques36().land();
    }
   
}

/*As per Java 8, default and static methods were added in the interface and default methods can invoke static method as well. Hence, there is no issue with the Flyable interface.



class Aeroplane implements Flyable interface, hence it inherits the default method fly() and static method horizontalDegree() can be accessed using Flyable.horizontalDegree(). It also provides the implementation of land() method. There is no issue with Aeroplane class as well.



On execution below text is printed on to the console:

Flying at 20 degrees.

Landing at -20 degrees. */
