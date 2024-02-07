import java.time.LocalDateTime;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last value to sum: ");
        //int n = scanner.nextInt();
        long n = scanner.nextLong();
        long start1 = System.currentTimeMillis();
        System.out.println(start1);
        System.out.println("matrix: " + matrix(n));
        long end1 = System.currentTimeMillis();
        float secMatrix = (end1 - start1)/1000F;
        System.out.println("verify " + verify(n));
        long end2 = System.currentTimeMillis();
        float secLoop = (end2 - end1)/1000F;
        System.out.println("secMatrix" + secMatrix + ", secLoop: " + secLoop);
        scanner.close();
    }

    static long verify(long n){
        int f = 0;
        for(int i = 0; i<=n; i++) f += i;
        return f;
    }

    static long matrix (long n){
        return (n/2)*(n+1);
    }

}
