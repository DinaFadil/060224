package Assignments;
import java.util.Arrays;

public class SelectionSort {
    static double[] array1 = {8.0, -2.5, -5.0, 1.0, 9.0};

    public static void main(String[] args) {
        selectionSort(array1, true);
        //selectionSort(array1, false);
        System.out.println(Arrays. toString(array1));
        
    }

    public static void selectionSort(double[] d, boolean inc){
        int idxToSwap, len = d.length;
        double temp;

        for(int i = 0; i<=(len-1); i++){
            int k = i == 0 ? 0 : i -1;
            if(inc){
                idxToSwap = findMinldx(d, k);
            }
            else{
                idxToSwap = findMaxldx(d, k);
            }
            temp = d[idxToSwap];
            d[idxToSwap] = d[k];
            d[k] = temp;

        }
    }

    public static int findMinldx(double[] d, int k){
        int minldx = k;
        for(int i = k + 1; i<d.length; i++){
            if(d[i] < d[minldx]){
                minldx = i;
            }
        }

        return minldx;
    }

    public static int findMaxldx(double[] d, int k){
        int maxldx = k;
        for(int i = k + 1; i<d.length; i++){
            if(d[i] > d[maxldx]){
                maxldx = i;
            }
        }

        return maxldx;
    }

}
