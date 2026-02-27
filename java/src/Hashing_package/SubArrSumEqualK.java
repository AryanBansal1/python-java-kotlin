package Hashing_package;

import java.util.HashMap;

public class SubArrSumEqualK {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        System.out.println(NumberOfSubArrWithSumEqualToK(arr, k));
        
    }
    public static int NumberOfSubArrWithSumEqualToK(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();   // storing sum as key and frequency of that sum as value
        int count=0;
        int sum=0;
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){  
                count+=map.get(sum-k);          
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(map);
        return count;
    }
}
