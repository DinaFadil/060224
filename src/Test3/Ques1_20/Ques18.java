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
