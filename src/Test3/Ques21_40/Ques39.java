package Test3.Ques21_40;

public class Ques39 {
    public static void main(String[] args) {
        outer: for(int i = 0; i<3; System.out.println(i)){
            i++;
            inner: for(int j = 0; j< 3; System.out.println(j)){
                if(i>++j){
                    break outer;
                }
            }
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



In the given code, for both the loops, `System.out.print(...)` is used as [ForUpdate] expression, which is a MethodInvocation expression and hence a valid statement.

Given code compiles successfully.



Let's check the iterations:

1st iteration of outer: i = 0. i < 3 evaluates to true.

i = 1.

1st iteration of inner: j = 0. j < 3 evaluates to true as j = 0. Boolean expression `i > ++j` = `1 > 1` evaluates to false. j = 1.

2nd iteration of inner: `System.out.print(j)` prints 1 to the console. j < 3 evaluates to true as j = 1. Boolean expression `i > ++j` = `1 > 2` evaluates to false. j = 2.

3rd iteration of inner: `System.out.print(j)` prints 2 to the console. j < 3 evaluates to true as j = 2. Boolean expression `i > ++j` = `1 > 3` evaluates to false. j = 3.

4th iteration of inner: `System.out.print(j)` prints 3 to the console. j < 3 evaluates to false as j = 3. Control goes out of inner for loop and to the [ForUpdate] expression of outer loop.

2nd iteration of outer: `System.out.print(i)` prints 1 to the console. i < 3 evaluates to true as i = 1.

i = 2.

1st iteration of inner: j = 0. j < 3 evaluates to true as j = 0. Boolean expression `i > ++j` = `2 > 1` evaluates to true. j = 1. ` break outer;` takes the control out of the outer for loop.



Program terminates successfully after printing 1231 on to the console. */
