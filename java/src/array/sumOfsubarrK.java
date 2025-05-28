// KADANE'S ALGO

import java.util.*;
public class sumOfsubarrK{

    public static void kadaneSumofSubArr(int arr[]){
        int currSum=0;
        int maximumSum= Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            currSum+= arr[i];
            if(maximumSum<currSum){
                maximumSum= currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("The maximum sum of subarr "+maximumSum);
    }

    
    public static void main(String[] args) {
        //int arr[]={1,-2,6,-1,3};
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadaneSumofSubArr(arr);
    }
}