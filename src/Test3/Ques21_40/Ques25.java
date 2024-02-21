package Test3.Ques21_40;

public class Ques25 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30};
        int i = 0;
        arr[i++] = arr[++i] = 40;
        for(int x : arr)
            System.out.println(x);
    }
    
}
/*At Line n1, an int [] object of three elements is created and 'arr' refers to this array object.

arr[0] = 10, arr[1] = 20 and arr[2] = 30;



Given expression at Line n2:

arr[i++] = arr[++i] = 40;

Multiple assignment operators are available, so lets group it first.

=> arr[i++] = (arr[++i] = 40); //Assignment operator is right to left associative

Above expression is valid, hence Line n2 compiles successfully.

Let's solve the expression now. Left operand is 'arr[i++]' and right operand is '(arr[++i] = 40)'. Left operand is evaluated first.

=> arr[0] = (arr[++i] = 40); //i = 1

Right hand operand is evaluated next.

=> arr[0] = (arr[2] = 40); //i = 2

=> arr[0] = 40; //i = 2, arr[2] = 40.

Hence after Line n2, arr refers to int [] object {40, 20, 40}.



Given loop prints below on to the console:

40

20

40 */