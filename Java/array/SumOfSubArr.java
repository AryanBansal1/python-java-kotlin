// PREFIX METHOD 

import java.util.*;
public class SumOfSubArr {

    // USING BRUTE FORCE

    public static void SumOfSubArray(int arr[]){
        int min_value = Integer.MIN_VALUE;
        int max_value = Integer.MAX_VALUE;
        //start
        for(int i=0; i<arr.length;i++){
            //giving end
            for(int j=i; j<arr.length;j++){
                int sum =0;
                //printing sum
                for(int k=i;k<=j;k++){  
                    sum+=arr[k];
                }
                System.out.print(sum+" ");
                if(sum>min_value){
                    min_value=sum;
                }
                if(sum<max_value){
                    max_value=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum value = "+min_value);
        System.out.println("Minimum value= "+max_value);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9};
        //int arr[] = {1,-2,6,-1,3};   
        SumOfSubArray(arr);
    }
}



