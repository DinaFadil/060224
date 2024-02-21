package Test3.Ques1_20;

interface Blogger {
    default void blog() throws Exception{
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    public void blog(){
        System.out.println("TRAVEL");
    }
}

public class Ques14 {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger();
        ((TravelBlogger)blogger).blog();
    }
    
}
/*According to overriding rules, if super class / interface method declares to throw a checked exception, then overriding method of sub class / implementer class has following options:

1. May not declare to throw any checked exception.

2. May declare to throw the same checked exception thrown by super class / interface method.

3. May declare to throw the sub class of the exception thrown by super class / interface method.

4. Cannot declare to throw the super class of the exception thrown by super class / interface method.

5. Cannot declare to throw unrelated checked exception.

6. May declare to throw any RuntimeException or Error.



default methods were added in Java 8 and TravelBlogger class correctly overrides the default method blog() of Blogger interface. Blogger interface compiles successfully.



At Line n1, 'blogger' is of Blogger type (supertype) and it refers to an instance of TravelBlogger class (subtype), this is polymorphism and allowed in Java. Line n1 compiles successfully.

At Line n2, blog() method is being invoked on typecasting 'blogger' to TravelBlogger and as TravelBlogger class doesn't declare to throw any checked exception, hence Line n2 compiles successfully.



As instance is of TravelBlogger type, therefore on execution, Line n2 invokes blog() method of TravelBlogger instance, which prints TRAVEL on to the console. */
