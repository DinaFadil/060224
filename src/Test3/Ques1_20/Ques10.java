package Test3.Ques1_20;

public class Ques10 {
    int i1 = 10;
    static int i2 = 20;

    private void change(int val){
        i1 = ++val;// Line n1
        i2 = val++;// Line n2
    }

    private static void change2(int val){
        i1 = --val; //Line n3
        i2 = val--; //Line n4
    }

    public static void main(String[] args) {
        change1(5); //Line n5
        change2(5); //Line n6
        System.out.println(i1 + i2); //Line n7
    }
    
}
