package worksheet_questions.ArrayQuestions;
import java.util.*;
public class tcs {

    public static int factorial(int a){
        if(a==1){
            return 1;
        }
        return a*factorial(a-1);
    }

    public static void strongnumber(int arr[]){
        System.out.print("strong numbers are: ");
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int temp = num;
            int sum=0;
            while(temp>0){
                int lastdigit = temp%10;
                int fact = factorial(lastdigit);
                sum+=fact;
                temp = temp/10;
            }
            if(sum==num){
                System.out.print(num+" ");
            }
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arrlength = sc.nextInt();
        int arr[] = new int[arrlength];
        int i=0;
        while(i<arrlength){
            int num = sc.nextInt();
            if(num>0){
                arr[i] = num;
                i++;
            }
            else{
                System.out.println("Enter a positive value only");
            }
        }
        strongnumber(arr);
    }
}
