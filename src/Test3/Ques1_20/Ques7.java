package Test3.Ques1_20;

public class Ques7 {
    /*INSERT */{
        System.out.println("All is well");
    }

}

//BETULL
//public static void main(String... a)
//static public void main(String [] args)
//public static void main(String [] a)

//SALOH
//public static Void main(String [] args)
//public void main(String... args)
//static public void Main(String [] args)
//protected static void main(String [] args)
//public void static main(String [] args)

/*comment: 
private and protected cannot be put for Main class running the program. mesti public */

/*As System.out.println needs to be executed on executing the Test class, this means special main method should replace INSERT.

Special main method's name should be "main" (all characters in lower case), should be static, should have public access specifier and it accepts argument of String [] type (Varargs syntax String... can also be used). String [] argument can use any identifier name, even though in most of the cases you will see "args" is used. Position of static and public can be changed but return type 'void' must come just before the method name.



Let's check all the given options one by one:

public void static main(String [] args): Compilation error as return type 'void' must come just before the method name 'main'.

protected static void main(String [] args): Compiles successfully but as this method is not public, hence an Error regarding missing main method is thrown on execution.

public void main(String... args): Compiles successfully but as this method is not static, hence an Error regarding non-static main method is thrown on execution.

static public void Main(String [] args): Compiles successfully but as 'M' is capital in method 'Main', hence it is not special main method. An Error regarding missing main method is thrown on execution.

static public void main(String [] args): Valid definition, it compiles successfully and on execution prints "All is well" on to the console.

public static void main(String [] a): Valid definition, it compiles successfully and on execution prints "All is well" on to the console.

public static Void main(String [] args): Compilation error as Void is a final class in Java and in this case compiler expects main method to return a value of Void type. If you add `return null;` to the main method code will compile successfully but on execution an Error will be thrown mentioning that return type must be 'void' ('v' in lower-case).

public static void main(String... a): Valid definition, it compiles successfully and on execution prints "All is well" on to the console.*/
