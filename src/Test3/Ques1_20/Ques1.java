package Test3.Ques1_20;

public class Ques1 {
    public static void main(String[] args){
        int ctr = 100;
        one: for (int i = 0; i<10; i++){
            two: for (int j = 0; j<7; j++){
                three: while(true){
                    ctr++;
                    if(i>j){
                        break one;
                    }else if (i==j){
                        break two;
                    }else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
    
}

/*For the 1st loop variable 'i' infers to int type, so no issues for 1st loop and for the 2nd loop variable 'j' infers to int type, so no issues for 2nd loop as well.

Let's check the iteration:

1st iteration of loop one: i = 0

1st iteration of loop two: j = 0

1st iteration of loop three: ctr = 101. As `i == j` evaluates to true, hence `break two;` gets executed, which takes the control out of loop two and hence to the increment expression (i++) of loop one.

2nd iteration of loop one; i = 1

1st iteration of loop two: j = 0

1st iteration of loop three; ctr = 102. As `i > j` evaluates to true, hence `break one;` gets executed, which takes the control out of the loop one.



`System.out.println(ctr);` prints 102 on to the console. */
