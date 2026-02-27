package Hashing_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        UnionAndIntersectionMethod(arr1,arr2);

    }
    public static void UnionAndIntersectionMethod(int arr1[],int arr2[]){
        countIntersection(arr1, arr2);
        countUnion(arr1,arr2);

    }
    public static void countIntersection(int arr1[],int arr2[]){
        int countIntersection=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int j : arr2){
            if(set.contains(j)){
                countIntersection++;
                System.out.print(j+" ");
                 set.remove(j);
            }
        }
        System.out.println();
        System.out.println("Number of Intersection : "+countIntersection);
    }
    public static void countUnion(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int j:arr2){
            set.add(j);
        }
        System.out.println("The number of union is : "+set.size());
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
