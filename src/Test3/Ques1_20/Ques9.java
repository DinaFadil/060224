package Test3.Ques1_20;

public class Ques9 {
    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y>x && z>y; y++, z-= 2){
            System.out.println(x + y + z);
        }
    }
    
}

/*Basic/Regular for loop has following form:

for ( [ForInit] ; [Expression] ; [ForUpdate] ) {...}

[ForInit] can be local variable initialization or the following expressions:

Assignment

PreIncrementExpression

PreDecrementExpression

PostIncrementExpression

PostDecrementExpression

MethodInvocation

ClassInstanceCreationExpression



[ForUpdate] can be following expressions:

Assignment

PreIncrementExpression

PreDecrementExpression

PostIncrementExpression

PostDecrementExpression

MethodInvocation

ClassInstanceCreationExpression



The [Expression] must have type boolean or Boolean, or a compile-time error occurs. If [Expression] is left blank, it evaluates to true.



All the expressions can be left blank; for(;;) is a valid for loop and it is an infinite loop as [Expression] is blank and evaluates to true.



Multiple comma separated statements are allowed for [ForInit] and [ForUpdate] expressions, where as [Expression] must be single expression which results in boolean or Boolean.



In the given for loop:

[ForInit] = int x = 10, y = 11, z = 12: It is allowed. 3 variables are declared and initialized. x = 10, y = 11 & z = 12.

[Expression] = y > x && z > y = (y > x) && (z > y) [Relational operator has higher precedence than logical AND]. This expression is valid and results in boolean value.

[ForUpdate] = y++, z -= 2. It is allowed. y is incremented by 1 and z is decremented by 2.



Let's check the loop's iteration:

1st iteration: x = 10, y = 11, z = 12. (y > x) && (z > y) = (11 > 10) && (12 > 11) = true && true = true. Loop's body is executed and prints x + y + z = 10 + 11 + 12 = 33 on to the console.

2nd iteration: [ForUpdate] is executed. y = 12, z = 10. (y > x) && (z > y) = (12 > 10) && (10 > 12) = true && false = false.

Control goes out of for loop and program terminates successfully.



Loop's body executes once and prints 33 on to the console. */
