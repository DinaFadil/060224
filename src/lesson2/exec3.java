package lesson2;

public class exec3 {
    public static void main(String[] args) {
        String str = "gjsbvkdsfbwdkfwkd";
        String search = "gjs";
        System.out.println(str);
        System.out.println(str.concat(str));
        str = str.concat(str);
        System.out.println(str);
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        if(str.contains(search)){
            //System.out.println("contain gjs");
            System.out.printf("contain gjs", search);
        }
        else{
            //System.out.println("does not contain gjs");
            System.out.printf("does not contain gjs", search);
        }


    }
}
