package Hashing_package;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String args[]){
        int nums[] = {4,3,2,5,6,7,3,4,2,1};
        int res = countdistinct(nums);
        System.out.println(res);
    }
    public static int countdistinct(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        return set.size();
    }
}
