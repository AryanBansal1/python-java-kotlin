package array_package;
import java.util.*;
public class largestofarray {

    //Creating largest of array fun
    public static void largeandsmallOfArray(int a[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<a.length;i++){
            if(a[i]>largest){
                largest = a[i];
            }
            if (a[i]<smallest){
                smallest = a[i];
            }
        }

        System.out.println(largest);
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        int number[]={4,6,1,18,5,84,3};
        largeandsmallOfArray(number);
    }
}
