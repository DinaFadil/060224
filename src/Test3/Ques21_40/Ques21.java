package Test3.Ques21_40;

public class Ques21 {
    int elements = 0;
    Object [] arr = {"A", "E", "I", new Object(), "O", "U"};
    for(Object obj : arr){
        if(obj instanceof String){
            continue;
        }else{
            break;
        }
        elements++;
    }
    System.out.println(elements);
    
}

/*Line n1 and Line n2 don't cause any compilation error.



if-else block uses break; and continue; statements. break; will exit the loop and will take the control to Line n4 on the other hand continue; will take the control to Line n2. In both the cases Line n3 will never be executed.

As Compiler knows about it, hence it tags Line n3 as unreachable, which causes compilation error. */