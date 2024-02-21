package Test3.Ques21_40;

public class Ques40 {
    public static void main(String[] args) {
        String str = "Game on";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(str.contentEquals(sb));
        System.out.println(sb.contentEquals(str));
        System.out.println(sb.equals(str));
        System.out.println(str.equals(sb));
    }
    
}
/*There are no issues with Line n1 and Line n2, both the statements compile successfully.



String class contains contentEquals(CharSequence) method. Please note that String, StringBuilder and StringBuffer classes implement CharSequence interface, hence contentEquals(CharSequence) method defined in String class cab be invoked with the argument of either String or StringBuilder or StringBuffer.

At Line n3, `str.contentEquals(sb)` is invoked with StringBuilder argument and hence it compiles fine. On execution it would compare the contents of String object and the passed StringBuilder object. As both the String object and StringBuilder object contains same content "Game on", hence on execution, Line n3 will print true.



contentEquals method is not available in StringBuilder class and hence Line n4 causes compilation error.



equals method declared in Object class has the declaration: `public boolean equals(Object)`. Generally, equals method is used to compare different instances of same class but if you pass any other object, there is no compilation error. Parameter type is Object so it can accept any Java object.



`str.equals(sb)` => It compiles fine, String class overrides equals(Object) method but as 'sb' is of StringBuilder type so `str.equals(sb)` would return false at runtime.



`sb.equals(str)` => It also compiles fine, StringBuilder class doesn't override equals(Object) method. So Object version is invoked which uses == operator, hence `sb.equals(str)` would return false as well at runtime. */
