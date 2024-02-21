package Test3.Ques1_20;

public class Ques18 {
    public static void main(String[] args) {
        int num = 10;
        if(num++ == num++){
            System.err.println("EQUAL " + num);
        }else {
            System.out.println("NOT EQUAL " + num);
        }
    }
    
}

/*Given boolean expression:

(num++ == num++) //num=10

(10 == num++) //Left side operand is evaluated first, value 10 is used in the expression and variable num is incremented by 1, so num=11

(10 == 11) //Right side operand is evaluated next, value 11 is used in the expression and variable num is incremented by 1, so num = 12

Above expression evaluates to false, hence else block is executed and NOT EQUAL 12 is printed on to the console. */
