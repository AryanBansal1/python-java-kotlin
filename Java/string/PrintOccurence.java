package string;
import java.util.Scanner;

public class PrintOccurence {

    public static void printOccurence(String s){
        int arr[] = new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                System.out.println( (char)i+" count equals to "+ arr[i]);
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printOccurence(s);
        sc.close();
    }
}
