package Assignments;

public class MultiDimension {
    public static void main(String[] args) {

        int [][][] a = {{{1,2,3},{4,5},{6}},{{7,8},{9}}}; 
        System.out.println("a.length = " + a.length);
        System.out.println("a[0].length = " + a[0].length);
        System.out.println("a[0][0].length = " + a[0][0].length);
        System.out.println("a[0][0][0] = " + a[0][0][0] + ", a[0][0][1] = " + a[0][0][1] + ", a[0][0][2] = " + a[0][0][2]);
        System.out.println("a[0][1].length = " + a[0][1].length);
        System.out.println("a[0][1][0] = " + a[0][1][0] + ", a[0][1][1] = " + a[0][1][1]);
        System.out.println("a[0][2].length = " + a[0][2].length);
        System.out.println("a[0][2][0] = " + a[0][2][0]);
        System.out.println("a[1].length = " + a[1].length);
        System.out.println("a[1][0].length = " + a[1][0].length);
        System.out.println("a[1][0][0] = " + a[1][0][0] + "a[1][0][1] = " + a[1][0][1]);
        System.out.println("a[1][1].length = " + a[1][1].length);
        System.out.println("a[1][1][0] = " + a[1][1][0]);

    }
    
}
