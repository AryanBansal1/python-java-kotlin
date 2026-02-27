package array_package;
import java.util.*;
public class prefix_Subarray{
    public static void prefixSumofSubarray(int arr[]){
        int sum =0;
        int minimum_value = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // making prefix array with prefix containing the sum
        for(int i = 1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        //giving the starting index for prefix
        for(int i =0;i<arr.length;i++){

            //giving the ending index for prefix
            for(int j =i;j<arr.length;j++){
                if(i==0){
                    sum = prefix[j];
                }
                else{
                    sum = prefix[j]-prefix[i-1];
                    
                }
                if(sum>minimum_value){
                    minimum_value= sum;
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        System.out.println("Maximum value is "+minimum_value);

    }



    public static void main(String args[]){
        int arr[] ={1,-2,6,-1,3};
        prefixSumofSubarray(arr);
        }
    }
