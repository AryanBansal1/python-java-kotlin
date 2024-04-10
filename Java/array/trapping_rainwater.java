import java.util.*;
public class trapping_rainwater {

    public static void trappingRainwater(int arr[]){
        //making auxiliary array
        //leftArr
        int leftboundary[] = new int[arr.length];
        leftboundary[0]=arr[0];
        //max left elements
        for(int i =1;i<arr.length;i++){      
            leftboundary[i] = Math.max(arr[i], leftboundary[i-1]);
        }

        //rightArr
        int rightboundary[]= new int[arr.length];
        rightboundary[rightboundary.length-1]= arr[arr.length-1];
        //max right elements
        for(int i = (arr.length-2);i>=0;i--){
            rightboundary[i]= Math.max(arr[i], rightboundary[i+1]);  
        } 

        //calculate water level & trapped water
        int totaltrappedwater = 0;
        for(int i = 0;i<arr.length;i++){
            int waterlevel = Math.min(leftboundary[i], rightboundary[i]);
            int trappedWater = waterlevel-arr[i];
            System.out.println(trappedWater);
            totaltrappedwater+=trappedWater;

        }
        System.out.println("Total water trapped is "+ totaltrappedwater);
    }


    public static void main(String[] args) {
        int heightArr[]={4,2,0,6,3,2,5};
        trappingRainwater(heightArr);
    }
}
