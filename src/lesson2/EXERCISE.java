package lesson2;
import java.util.Scanner;

public class EXERCISE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();
        //boolean p = false;
        //boolean q = true;

        //x = 2,1,9,10
        //y = 6,1,4,5
        //p = t,t,f,f
        //q = t,f,t,f

        if(x != y){
            System.out.println("==>1");
        }
        if(x>y){
            System.out.println("==>2");
        }
        if(x%y == 0){
            System.out.println("==>3");
        }

        /*if(p && q){
            q = false;
            System.out.println(q);
        } else{
            if(!q){
                System.out.println(p);
            }
            if(p == q){
                System.out.println(p||q);
            }

        }*/
        sc.close();
       
    }

}
