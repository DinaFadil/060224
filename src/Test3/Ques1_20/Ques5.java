package Test3.Ques1_20;

class X{
    void A(){
        System.out.println("A");
    }
}

class Y extends X{
    void A(){
        System.out.println("A-");
    }

    void B(){
        System.out.println("B-");
    }

    void C(){
        System.out.println("C-");
    }
}

public class Ques5 {
    public static void main(String[] args) {
        X obj = new Y();
        obj.A();
        obj.B();
        obj.C();
    }   
}

/*Class Y correctly extends class X and it overrides method A() and provides two new methods B() and C().

At Line n1, obj is of X type and therefore obj.B(); and obj.C(); cause compilation error as these methods are not defined in class X. */
