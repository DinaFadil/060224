package Test3.Ques21_40;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base{
    Base() throws IOException{
        System.out.println(1);
    }
}

class Derived extends Base{
    Derived() throws FileNotFoundException{
        System.out.println(2);
    }
}
public class Ques34 {
    public static void main(String[] args) throws Exception{
        new Derived();
    }
    
}

/*It is legal for the constructors to have throws clause.

Constructors are not inherited by the Derived class so there is no method overriding rules related to the constructors but as one constructor invokes other constructors implicitly or explicitly by using this(...) or super(...), hence exception handling becomes interesting.



Java compiler adds super(); as the first statement inside Derived class's constructor:

Derived() throws FileNotFoundException {

super(); //added by the compiler

System.out.print(2);

}



As super(); invokes the constructor of Base class (which declares to throw IOException), compiler complains as Derived class no-argument constructor doesn't declare to throw IOException. It declares to throw FileNotFoundException (subclass of IOException), which is not enough for the instances of IOException. */
