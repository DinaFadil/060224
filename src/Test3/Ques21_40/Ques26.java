package Test3.Ques21_40;

public class Ques26 {
    public static void main(String[] args) {
        String text = "ONE ";
        System.out.println(text.concat(text.concat("ELEVEN")).trim());
    }
    
}
/*Given statement:

System.out.println(text.concat(text.concat("ELEVEN ")).trim()); //'text' refers to "ONE "

System.out.println(text.concat("ONE ELEVEN ").trim()); //As String is immutable, hence there is no change in the String object referred by 'text', 'text' still refers to "ONE "

System.out.println(("ONE ONE ELEVEN ").trim()); //'text' still refers to "ONE "

System.out.println("ONE ONE ELEVEN"); //trim() method removes the trailing space in this case

ONE ONE ELEVEN is printed on to the console. */
