package Test3.Ques21_40;

class Message{
    String msg = "LET IT GO!";

    public void print(){
        System.out.println(msg);
    }
}

public class Ques29 {

    public static void change(Message m){
        m.msg = "NEVER LOOK BACK!";
    }

    public static void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
    }
    
}

/*Message class doesn't specify any constructor, hence Java compiler adds below default constructor:

Message() {super();}



Line n1 creates an instance of Message class and initializes instance variable 'msg' to "LET IT GO!". Variable 'obj' refers to this instance.

Line n2 prints LET IT GO! on to the console.

Line n3 invokes change(Message) method, as it is a static method defined in TestMessage class, hence `change(obj);` is the correct syntax to invoke it. Line n3 compiles successfully. On invocation parameter variable 'm' copies the content of variable 'obj' (which stores the address to Message instance created at Line n1). 'm' also refers to the same instance referred by 'obj'.



Line n6, assigns "NEVER LOOK BACK!" to the 'msg' variable of the instance referred by 'm'. As 'obj' and 'm' refer to the same instance, hence obj.msg also refers to "NEVER LOOK BACK!". change(Message) method finishes its execution and control goes back to main(String[]) method.



Line n4 is executed next, print() method is invoked on the 'obj' reference and as obj.msg refers to "NEVER LOOK BACK!", so this statement prints NEVER LOOK BACK! on to the console.



Hence in the output, you get:

LET IT GO!

NEVER LOOK BACK! */
