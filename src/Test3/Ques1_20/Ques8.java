package Test3.Ques1_20;

public class Ques8 {
    public static void main(String[] args) {
        int score = 30;
        char grade = 'F';
        if(50 <= score <60)
            grade = 'D';
        else if (60 <= score < 70)
            grade = 'C';
        else if (70<= score <80)
            grade = 'B';
        else if (score >= 80)
            grade = 'A';
        System.out.println(grade);
    }
}

/*Line n1 and Line n2 compile successfully.



Let's check the boolean expression of Line n3:

50 <= score < 60

As multiple operators are available, so let's group the operators first on the basis of precedence and associativity.

Relational operators (<, >, <= and >=) are at same level and left to right associative, hence given expression can be grouped as:

(50 <= score) < 60

< is a binary operator with two operands: (50 <= score) on the left is of boolean type and 60 on the right is of int type. But < operator is not defined for boolean, int type and hence Line n3 causes compilation error. Line n4 and Line n5 cause compilation error for the same reason. */