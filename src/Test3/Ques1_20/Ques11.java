package Test3.Ques1_20;

interface Perishable1{
    default int maxDays(){
        return 1;
    }
}

interface Perishable2 extends Perishable1 {
    default int maxDays(){
        return 2;
    }
}

class Milk implements Perishable2, Perishable1{}

public class Ques11 {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        System.out.println(obj.maxDays());
    }
    
}
