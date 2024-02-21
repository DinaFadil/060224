package Test3.Ques21_40;

public class Ques30 {
    public static void main(String[] args) {
        char c1 = 'a';
        int i1 = c1;
        System.out.println(i1);
    }
    
}

/*Explanation
Range of char data type is from 0 to 65535 and hence it can be easily assigned to int type. println() method is overloaded to accept char type and int type both. If char type value is passed, it prints char value and if int type value is passed, it prints int value.

As i1 is of int type, hence corresponding int value, which is 97, is printed on to the console. */
