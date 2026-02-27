package Hashing_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int arr2[] = {1,2};
        int result = findMajorityElement(arr);
        ArrayList<Integer> avgplus = ElementMoreThanAvg(arr);
        ArrayList<Integer> avgplus2 = ElementMoreThanAvg(arr2);
        System.out.println(result);
        System.out.println(avgplus);
        System.out.println(avgplus2);
    }
    public static int findMajorityElement(int []arr){
        int minValue = Integer.MIN_VALUE;
        int result=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            // if(!map.containsKey(i)){
            //     map.put(i,1 );                
            // }
            // else{
            //     int value = map.get(i)+1;
            //     map.put(i, value);
            // }
            map.put(i,map.getOrDefault(i, 0)+1);       // The above line of code shorten to 1 line

            if(map.get(i)>minValue){
                minValue = map.get(i);
                result=i;
            }
        }
        return result;

    }
    public static ArrayList<Integer> ElementMoreThanAvg(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int count = arr.length/3;
        for(int i : arr){
            // if(!map.containsKey(i)){
            //     map.put(i, 1);
            // }
            // else{
            //     int v = map.get(i);
            //     map.put(i, v+1);
            // }
            int freq = map.getOrDefault(i, 0)+1;
            map.put(i, freq);
        }
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            if(map.get(key)>count){
                result.add(key);
            }
        }
        return result;

    }
}
