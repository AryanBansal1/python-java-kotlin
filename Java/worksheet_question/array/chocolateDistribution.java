package array;
import java.util.Arrays;
public class chocolateDistribution {
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        chocoDistProb(arr, 7);
    }

    public static void chocoDistProb(int arr[],int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int starting_index=0;
        int ending_index=0;
        for(int i=0;i<=arr.length-m;i++){
            int j = i+(m-1);
            int min_diff = arr[j]-arr[i];
            if(min_diff<min){
                min = min_diff;
                starting_index= i;
                ending_index = j;
            }
        }
        for(int i = starting_index;i<=ending_index;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Minimum difference is "+ min );
    }
}
