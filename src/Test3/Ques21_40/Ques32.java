package Test3.Ques21_40;

public class Ques32 {
    public static void main(String[] args) {
        int x = 10;
        if(false)
            System.out.println(x);
        System.out.println("HELLO");
    }
    
}

/*Even though compiler is aware that Line n2 will never execute, but it doesn't tag it as unreachable code. Reason for this odd behavior is explained in the Java Language specification:

https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.21

Following statement results in a compile-time error:

while (false) { x=3; }

because the statement x=3; is not reachable; but the superficially similar case:

if (false) { x=3; }

does not result in a compile-time error. An optimizing compiler may realize that the statement x=3; will never be executed and may choose to omit the code for that statement from the generated class file, but the statement x=3; is not regarded as "unreachable" in the technical sense specified here.



The rationale for this differing treatment is to allow programmers to define "flag" variables such as:



static final boolean DEBUG = false;

and then write code such as:



if (DEBUG) { x=3; }

The idea is that it should be possible to change the value of DEBUG from false to true or from true to false and then compile the code correctly with no other changes to the program text.



Line n2 is not executed but Line n3 executes successfully and prints HELLO on to the console. */
