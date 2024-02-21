package Test3.Ques1_20;

public class Ques4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("B");
        sb.append(sb.append("A"));
        System.out.println(sb);
    }
    
}

/*At Line n1:

sb --> {"B"}



append(...) method in StringBuilder class is overloaded to accept various arguments and 2 such arguments are String and CharSequence. It's return type is StringBuilder and as StringBuilder class implements CharSequence interface, hence 'sb.append("A")' can easily be passed as and argument to sb.append(...) method. Line n2 compiles successfully.

At Line n2:

sb.append(sb.append("A")); //sb --> {"B"}

sb.append({"BA"}); //sb --> {"BA"}

{"BABA"}



Hence, Line n3 prints BABA */