package Test3.Ques21_40;

public class Ques35 {
    public static void main(String[] args) {
        byte b1 = 10;
        int i1 = b1;
        byte b2 = i1;
        System.out.println(b1 + i1 + b2);
    }
    
}

/*Let us first check Line n1: byte b1 = 10;

Above statement compiles successfully, even though 10 is an int literal (32 bits) and b1 is of byte primitive type which can store only 8 bits of data.

Here java does some background task, if value of int literal can be easily fit to byte primitive type (-128 to 127), then int literal is implicitly casted to byte type.

So above statement is internally converted to:

byte b1 = (byte)10;



But if you specify any out of range value then it would not be allowed, e.g.

byte b = 128; // It would cause compilation failure as 128 is out of range value for byte type.



There is no issue with Line n2 as byte type (8 bits) can be easily assigned to int type (32 bits).



For line n3, `byte b2 = i1;`, expression on right hand side (i1) is neither a withing range literal value nor constant expression, hence it causes compilation failure.

To compile successfully, this expression needs to be explicitly casted, such as: `byte b2 = (byte)i1;`
 */
