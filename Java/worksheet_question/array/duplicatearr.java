package array;

import java.util.Arrays;

public class duplicatearr {
    public static void main(String[] args) {
        System.out.println(dupcheck(new int[]{1,2,4,5,7,8,9} ));
        
    }
    //  METHOD 1 TIME COMPEXITY 0(N^2)
    public static Boolean duplicacycheck(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // METHOD 2TIME COMPEXITY O(N LOG(N))
    public static Boolean dupcheck(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

}
