package array_package;
import java.util.*;
public class pairInArray {
    // TIME COMPLEXITY = O(N^2)
    // NUMBER OF PAIRS = (N(N-1))/2

    public static void pairsOfArray(int arr[]){
        int tp = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+tp);
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7,8};
        pairsOfArray(arr);

    }
}
