package array_package;
import java.util.Scanner;
public class binarySearch {

    public static int bsearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{start = mid+1;}
        }       
        return -1;
    }   

    public static void main(String args[]){
      // Sorted array
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your key");
      int key = sc.nextInt();
      int arr [] = {2,3,5,7,9,12,18,57,77};
      int answer = bsearch(arr, key);
      if (answer == -1){
            System.out.println("key not found");
      }
      else{System.out.println(answer);}
    }
}
