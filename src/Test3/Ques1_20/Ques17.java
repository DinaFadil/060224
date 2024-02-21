package Test3.Ques1_20;

public class Ques17 {
    private static void test() throws Exception{
        throw new Exception();
    }

    public static void main(String [] args){
        try {
            test();
        }finally {
            System.out.println("GAME ON");
        }
    }
    
}

/*Method test() throws Exception (checked) and it declares to throw it, so no issues with method test().

But main(String []) method neither provides catch handler nor throws clause and hence main(String []) method causes compilation error.

Handle or Declare rule should be followed for checked exception if you are not re-throwing it. */
