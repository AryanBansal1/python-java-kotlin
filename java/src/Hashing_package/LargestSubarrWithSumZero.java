package Hashing_package;

import java.util.HashMap;

public class LargestSubarrWithSumZero {
    public static void main(String[] args) {
        int arr1[]={15,-2,2,-8,1,7,10,23};
        int arr2[]={3,4,5};
        System.out.println(SubArrayWithSumZero(arr1));
        System.out.println(SubArrayWithSumZero(arr2));
    }
    public static int SubArrayWithSumZero(int arr []){
        int maxcount=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(map.containsKey(sum)){
                int start = map.get(sum);
                if(maxcount<i-start){
                    maxcount= i-start;
                }
            }else{
                map.put(sum, i);
            }

        }
        System.out.println(map);
        return maxcount;
    }
}
